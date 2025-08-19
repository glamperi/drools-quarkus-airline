package org.acme.P32;


import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence32463B12AD8B31D3378213DF62919C3A implements org.drools.model.functions.Block2<org.acme.FlightIssue, java.util.List>, org.drools.model.functions.HashedExpression {

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
