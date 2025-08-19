package org.acme.P1C;


import static org.acme.Rules09873e35ef64456db42cb761404f935f.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence1C06C586704F8038312436B96159F04C implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "DA7C4C7A885B6EEE4833207F0CEFEC11";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        // Additional compensation for gold members
        $issue.setCustomerCompensation($issue.getCustomerCompensation() + 50.0);
        drools.update($issue, mask_$issue);
    }
}
