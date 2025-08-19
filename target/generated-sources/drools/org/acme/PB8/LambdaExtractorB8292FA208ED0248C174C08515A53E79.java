package org.acme.PB8;


import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorB8292FA208ED0248C174C08515A53E79 implements org.drools.model.functions.Function1<org.acme.FlightIssue, Integer>, org.drools.model.functions.HashedExpression {

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
