package org.acme.P01;


import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor01902A013B4A10B6B2CAE32768D44B7A implements org.drools.model.functions.Function1<org.acme.FlightIssue, java.lang.String>, org.drools.model.functions.HashedExpression {

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
