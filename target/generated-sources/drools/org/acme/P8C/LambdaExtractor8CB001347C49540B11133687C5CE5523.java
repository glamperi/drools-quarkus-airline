package org.acme.P8C;


import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor8CB001347C49540B11133687C5CE5523 implements org.drools.model.functions.Function1<org.acme.FlightIssue, Double>, org.drools.model.functions.HashedExpression {

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
