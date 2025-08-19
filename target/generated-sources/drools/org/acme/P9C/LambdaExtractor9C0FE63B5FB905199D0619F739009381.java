package org.acme.P9C;


import static org.acme.Rulese198757477be4c5c9f8282730ae3eaf2.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor9C0FE63B5FB905199D0619F739009381 implements org.drools.model.functions.Function1<org.acme.FlightIssue, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "6A1293806AF2EB179735F0B0460270D3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(org.acme.FlightIssue _this) {
        return _this.getCustomerLoyaltyStatus();
    }
}
