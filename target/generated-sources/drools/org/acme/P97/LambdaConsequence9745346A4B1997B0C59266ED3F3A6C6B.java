package org.acme.P97;


import static org.acme.Rulesbb4d749f84374de7ae1d2d0a2050f48e.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence9745346A4B1997B0C59266ED3F3A6C6B implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "DD78642A8E7F6C53CC9D107066B814CF";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatabb4d749f84374de7ae1d2d0a2050f48e.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        // Adjust compensation based on previous claims using the helper function
        $issue.setCustomerCompensation(500.0 - CompensationHelper.getPreviousCompensationThisYear());
        drools.update($issue, mask_$issue);
    }
}
