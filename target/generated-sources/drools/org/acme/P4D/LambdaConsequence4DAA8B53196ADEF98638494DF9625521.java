package org.acme.P4D;


import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence4DAA8B53196ADEF98638494DF9625521 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "EC65DA63E0C19EE1D110F945C7F3A365";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $1) throws java.lang.Exception {
        {
            {
                ($1).setCustomerCompensation(0.0);
            }
            {
                ($1).setApproved(false);
            }
            drools.update($1, mask_$1);
            drools.update($1, mask_$1);
        }
    }
}
