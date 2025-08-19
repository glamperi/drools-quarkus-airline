/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.acme;

import java.util.ArrayList;
import java.util.List;

import jakarta.inject.Inject;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.runtime.KieRuntimeBuilder;
import org.kie.api.runtime.KieSession;

import io.quarkiverse.mcp.server.Tool;
import io.quarkiverse.mcp.server.ToolArg;

public class FlighCompensationEndPoint {

	private final class RuleListener extends DefaultAgendaEventListener {
		private List<String> matchedRules = new ArrayList<>();

		private RuleListener() {
		}


		@Override
		public void afterMatchFired(AfterMatchFiredEvent event) {
			matchedRules.add(event.getMatch().getRule().getName());
			
		}

		public List<String> getMatchedRule() {
			return matchedRules;
		}
	}

	@Inject
	KieRuntimeBuilder kieRuntimeBuilder;

    @Tool(description = "Requires approval for compensation for a flight issue")
	public String flightCompensation(
			@ToolArg(description = "The flight number of flight which the requesting compensation for") String flightNumber,
			@ToolArg(description = "The issue, valid issues are delay, cancellation, lost luggage") String issueType,
			@ToolArg(description = "How long the delay lasted in hours or days") int issueDuration, 
			@ToolArg(description = "The initial compensation") double customerCompensation,
			@ToolArg(description = "The Customer Loyalty Tier: basic, silver, gold") String customerLoyaltyStatus) {
		KieSession session = kieRuntimeBuilder.newKieSession();
		FlightIssue issue = new FlightIssue(flightNumber, issueType, issueDuration, customerCompensation, customerLoyaltyStatus);
		

		List<FlightIssue> approvedRefunds = new ArrayList<>();
		session.setGlobal("approvedRefunds", approvedRefunds); // <-- Fix here
		session.setGlobal("maxRefundAllowed", 1000000);

		session.insert(issue);
		
		RuleListener ruleListener = new RuleListener();
		session.addEventListener( ruleListener);

		session.fireAllRules();
		session.dispose();
		
		if (approvedRefunds.isEmpty()) {
			return "None approved";
		} else {
			return "Approved compensations of "+ approvedRefunds.get(0).getCustomerCompensation() + " for " + approvedRefunds.get(0).getFlightNumber()
					+ "\n The rule used to approve the compensation is " + ruleListener.getMatchedRule();
		}
		
	}
}
