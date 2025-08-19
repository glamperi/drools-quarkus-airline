package org.acme.PF9;


import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceF9A8B3036D53D2D9A3E4BEAB73696213 implements org.drools.model.functions.Block0, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "89737757BB47BA96B32F8F4477F3CE9B";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute() throws java.lang.Exception {
        approvedApplications.add($l);
    }
}
