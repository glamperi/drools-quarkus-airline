package org.acme.P51;


import static org.acme.Rulesfae613fde6a544719d82f70d72d576a7.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence510D9138DAB79E76FB3CAC3ED2C4F06F implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "DA7C4C7A885B6EEE4833207F0CEFEC11";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafae613fde6a544719d82f70d72d576a7.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        // Additional compensation for gold members
        $issue.setCustomerCompensation($issue.getCustomerCompensation() + 50.0);
        drools.update($issue, mask_$issue);
    }
}
