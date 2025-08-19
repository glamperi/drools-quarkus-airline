package org.acme.PB5;


import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorB534A3A765070435611FAFA9503AA9AD implements org.drools.model.functions.Function1<org.acme.FlightIssue, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F829AF1C4C81A8D154F662FC611F6C3F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(org.acme.FlightIssue _this) {
        return _this.getIssueType();
    }
}
