package org.acme.P2E;


import static org.acme.Rulese9d1c29b0e6944ce97de0eb96c49ee37.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor2E334A371FB255BED3D0C935C1D3E469 implements org.drools.model.functions.Function1<org.acme.FlightIssue, Integer>, org.drools.model.functions.HashedExpression {

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
