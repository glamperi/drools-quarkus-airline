package org.acme.P91;


import static org.acme.Rules3be6c565a99a41e2ad1ffda02acdfc27.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence91B699CAD18ACB3A15BBD20521902F57 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "2E7E6226D5747A11CE80A58542B73CE8";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        $issue.setCustomerCompensation(50.0);
        drools.update($issue, mask_$issue);
    }
}
