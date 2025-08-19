package org.acme.P6C;


import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor6C106C394E670879E400EC749893D2D5 implements org.drools.model.functions.Function1<org.acme.FlightIssue, Double>, org.drools.model.functions.HashedExpression {

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
