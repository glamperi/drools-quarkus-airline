package org.acme.P4F;


import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence4F37F30436630255C473A0FC37FBB1F1 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "904CEF8815C6CD34060492613456F4A1";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $1) throws java.lang.Exception {
        {
            {
                ($1).setCustomerCompensation(Math.max(0, 500.0 - CompensationHelper.getPreviousCompensationThisYear()));
            }
            {
                ($1).setApproved(true);
            }
            drools.update($1, mask_$1);
            drools.update($1, mask_$1);
        }
    }
}
