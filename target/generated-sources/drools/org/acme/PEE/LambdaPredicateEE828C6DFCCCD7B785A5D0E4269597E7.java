package org.acme.PEE;


import static org.acme.Rulesfae613fde6a544719d82f70d72d576a7.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateEE828C6DFCCCD7B785A5D0E4269597E7 implements org.drools.model.functions.Predicate1<org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7FC04D8896EE20E1C5566F443CD40615";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.FlightIssue _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getIssueDuration(), 2);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("issueDuration > 2");
        info.addRuleNames("Delay Compensation for Basic Loyalty", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl", "Delay Compensation for Gold Loyalty", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl", "Delay Compensation for Silver Loyalty", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl");
        return info;
    }
}
