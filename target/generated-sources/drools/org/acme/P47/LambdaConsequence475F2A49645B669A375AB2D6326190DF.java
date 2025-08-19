package org.acme.P47;


import static org.acme.Rules1dae3899e63143dda2fff67e21fb3b02.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence475F2A49645B669A375AB2D6326190DF implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "176C383F2595943F0D95FB34E5247BED";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata1dae3899e63143dda2fff67e21fb3b02.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        $issue.setCustomerCompensation(0.0);
        drools.update($issue, mask_$issue);
        System.out.println("Offer voucher for future flight");
    }
}
