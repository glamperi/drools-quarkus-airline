package org.acme.P58;


import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence58976EF19AE585D83C883A1AC7DFBBA4 implements org.drools.model.functions.Block2<java.util.List, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A2C07BE9C6E13EBE46B477552701C1F3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(java.util.List approvedRefunds, org.acme.FlightIssue $1) throws java.lang.Exception {
        if (!approvedRefunds.contains($1)) {
            approvedRefunds.add($1);
        }
    }
}
