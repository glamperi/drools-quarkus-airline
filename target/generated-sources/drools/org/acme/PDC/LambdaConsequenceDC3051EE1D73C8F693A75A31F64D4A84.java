package org.acme.PDC;


import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceDC3051EE1D73C8F693A75A31F64D4A84 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "413ADA50BD1779A67A8A4288F6428332";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        {
            $issue.setCustomerCompensation($issue.getCustomerCompensation() + 50.0);
            {
                ($issue).setApproved(true);
            }
            drools.update($issue, mask_$issue);
            drools.update($issue, mask_$issue);
        }
    }
}
