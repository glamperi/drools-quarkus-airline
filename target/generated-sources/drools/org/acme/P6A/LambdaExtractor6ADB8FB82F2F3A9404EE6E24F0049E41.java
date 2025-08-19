package org.acme.P6A;


import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor6ADB8FB82F2F3A9404EE6E24F0049E41 implements org.drools.model.functions.Function1<org.acme.FlightIssue, java.lang.String>, org.drools.model.functions.HashedExpression {

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
