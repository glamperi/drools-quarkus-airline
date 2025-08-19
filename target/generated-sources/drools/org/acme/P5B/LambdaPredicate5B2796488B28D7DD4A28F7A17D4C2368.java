package org.acme.P5B;


import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate5B2796488B28D7DD4A28F7A17D4C2368 implements org.drools.model.functions.Predicate1<org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6CD0E99AC368EDFB82CAEE63A5640E2F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.FlightIssue _this) throws java.lang.Exception {
        return _this.isApproved();
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("approved");
        info.addRuleNames("CollectApprovedRefund", "/Users/garylamperillo/Dev/MCP/drools-quarkus-airline/src/main/resources/org/acme/rules.drl");
        return info;
    }
}
