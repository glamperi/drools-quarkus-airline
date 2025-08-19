package org.acme.PB6;


import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorB679E7EE8A2C2DD73EB267D5E222D722 implements org.drools.model.functions.Function1<org.acme.FlightIssue, Integer>, org.drools.model.functions.HashedExpression {

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
