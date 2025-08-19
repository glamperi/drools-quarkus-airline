package org.acme.P23;


import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate233A39E13D20A4B5E949BAE4B29821B8 implements org.drools.model.functions.Predicate1<org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D56682F7437703FF1226627687CEDF49";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.FlightIssue _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessOrEqualNumbers(_this.getIssueDuration(), 2);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("issueDuration <= 2");
        info.addRuleNames("Voucher for Minor Issues", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl");
        return info;
    }
}
