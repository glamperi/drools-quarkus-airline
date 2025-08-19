package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;
import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;

public class Rules6adbe6a6b634436099739cf88368a124_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$issue).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                        org.acme.P0B.LambdaPredicate0BBB5D899E768441EC1F1818E1E420F4.INSTANCE,
                                                                        D.reactOn("approved")),
                                             D.execute(org.acme.PF6.LambdaConsequenceF699351C7F1CB0A0C848B2EBE9660D50.INSTANCE));
        return rule;
    }
}
