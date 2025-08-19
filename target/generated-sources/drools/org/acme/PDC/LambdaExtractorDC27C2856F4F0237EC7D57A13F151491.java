package org.acme.PDC;


import static org.acme.Rulescad23af1ec7e4b77b3826641806be1f8.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorDC27C2856F4F0237EC7D57A13F151491 implements org.drools.model.functions.Function1<org.acme.FlightIssue, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "28F92F66A87E5E26DB116BD9125D8FB4";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.FlightIssue _this) {
        return _this.getIssueDuration();
    }
}
