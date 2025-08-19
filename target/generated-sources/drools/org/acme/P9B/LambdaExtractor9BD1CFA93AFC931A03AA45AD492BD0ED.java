package org.acme.P9B;


import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor9BD1CFA93AFC931A03AA45AD492BD0ED implements org.drools.model.functions.Function1<org.acme.FlightIssue, Double>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "1C979CD063A1583470918AE7DCE6F6FC";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Double apply(org.acme.FlightIssue _this) {
        return _this.getCustomerCompensation();
    }
}
