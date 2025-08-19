package org.acme.PFD;


import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceFD6ED9D2810122B3CC673FC8244504CB implements org.drools.model.functions.Block1<java.util.List>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "C95B38323C764E8E9E4121FB5F9C620D";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(java.util.List approvedRefunds) throws java.lang.Exception {
        approvedRefunds.add($l);
    }
}
