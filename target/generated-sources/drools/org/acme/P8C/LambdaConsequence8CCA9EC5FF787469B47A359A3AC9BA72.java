package org.acme.P8C;


import static org.acme.Rules126441f3ebc549f6b4abc3628813b14a.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence8CCA9EC5FF787469B47A359A3AC9BA72 implements org.drools.model.functions.Block2<org.acme.FlightIssue, java.util.List>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "CB23FBFDAB3568934A1F519EED157986";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.acme.FlightIssue $issue, java.util.List approvedRefunds) throws java.lang.Exception {
        approvedRefunds.add($issue);
    }
}
