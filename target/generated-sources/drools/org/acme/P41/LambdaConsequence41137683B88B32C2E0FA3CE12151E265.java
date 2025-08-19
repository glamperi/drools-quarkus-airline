package org.acme.P41;


import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence41137683B88B32C2E0FA3CE12151E265 implements org.drools.model.functions.Block2<org.acme.FlightIssue, java.util.List>, org.drools.model.functions.HashedExpression {

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
