package org.acme.P6C;


import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor6CBACB24DDA1676835DF390559F324BA implements org.drools.model.functions.Function1<org.acme.FlightIssue, Integer>, org.drools.model.functions.HashedExpression {

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
