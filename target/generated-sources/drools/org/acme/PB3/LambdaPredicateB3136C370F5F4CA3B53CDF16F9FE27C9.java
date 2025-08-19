package org.acme.PB3;


import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateB3136C370F5F4CA3B53CDF16F9FE27C9 implements org.drools.model.functions.Predicate1<org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "549D9F2DFFE018962E2624CCBAB90FB3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.FlightIssue _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getCustomerCompensation(), 500.0);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("customerCompensation > 500.0");
        info.addRuleNames("Annual Compensation Limit", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl");
        return info;
    }
}
