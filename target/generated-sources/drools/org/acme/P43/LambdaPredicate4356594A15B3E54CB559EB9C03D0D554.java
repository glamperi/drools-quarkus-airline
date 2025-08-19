package org.acme.P43;


import static org.acme.Rulesfae613fde6a544719d82f70d72d576a7.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate4356594A15B3E54CB559EB9C03D0D554 implements org.drools.model.functions.Predicate1<org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "B59E2BD393BAB196150D6FDF7FDDF4B1";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.FlightIssue _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getCustomerLoyaltyStatus(), "gold");
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("customerLoyaltyStatus == \"gold\"");
        info.addRuleNames("Delay Compensation for Gold Loyalty", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl", "Loyalty Benefits for Frequent Flyers", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl");
        return info;
    }
}
