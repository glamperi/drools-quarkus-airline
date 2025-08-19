package org.acme.P61;


import static org.acme.Rulese9d1c29b0e6944ce97de0eb96c49ee37.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence619FE1DD6AEFB04D3D19F69AFF130EE4 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "56D6903165E565D76928823AABA42878";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae9d1c29b0e6944ce97de0eb96c49ee37.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        {
            $issue.setCustomerCompensation(Math.min($issue.getCustomerCompensation(), 200.0));
            {
                ($issue).setApproved(true);
            }
            drools.update($issue, mask_$issue);
            drools.update($issue, mask_$issue);
        }
    }
}
