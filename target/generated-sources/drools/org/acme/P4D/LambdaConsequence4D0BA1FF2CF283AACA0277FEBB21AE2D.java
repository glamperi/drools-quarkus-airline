package org.acme.P4D;


import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence4D0BA1FF2CF283AACA0277FEBB21AE2D implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "4F077BFD6E1B1FEDA80A9871039C6BC3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $1) throws java.lang.Exception {
        {
            {
                ($1).setCustomerCompensation(50.0);
            }
            {
                ($1).setApproved(true);
            }
            drools.update($1, mask_$1);
            drools.update($1, mask_$1);
        }
    }
}
