package org.acme.PF3;


import static org.acme.Rules82a002fbe1c74b9aa9c520bf2006c277.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorF34E88E4B957C60E15911D0B8511581E implements org.drools.model.functions.Function1<org.acme.FlightIssue, Double>, org.drools.model.functions.HashedExpression {

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
