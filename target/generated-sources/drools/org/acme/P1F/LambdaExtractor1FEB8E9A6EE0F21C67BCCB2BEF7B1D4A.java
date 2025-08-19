package org.acme.P1F;


import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor1FEB8E9A6EE0F21C67BCCB2BEF7B1D4A implements org.drools.model.functions.Function1<org.acme.FlightIssue, java.lang.String>, org.drools.model.functions.HashedExpression {

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
