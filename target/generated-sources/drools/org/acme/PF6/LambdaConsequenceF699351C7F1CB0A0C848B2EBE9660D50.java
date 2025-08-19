package org.acme.PF6;


import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceF699351C7F1CB0A0C848B2EBE9660D50 implements org.drools.model.functions.Block0, org.drools.model.functions.HashedExpression {

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
