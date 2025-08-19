package org.acme.PBE;


import static org.acme.Rules915dcf213b7c4890a138331bce80a1c9.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorBEF980DB0118DA1EF359F1880D97252B implements org.drools.model.functions.Function1<org.acme.FlightIssue, Double>, org.drools.model.functions.HashedExpression {

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
