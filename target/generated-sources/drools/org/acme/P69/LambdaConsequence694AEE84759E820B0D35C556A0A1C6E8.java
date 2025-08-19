package org.acme.P69;


import static org.acme.Rulese9d1c29b0e6944ce97de0eb96c49ee37.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence694AEE84759E820B0D35C556A0A1C6E8 implements org.drools.model.functions.Block2<org.acme.FlightIssue, java.util.List>, org.drools.model.functions.HashedExpression {

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
