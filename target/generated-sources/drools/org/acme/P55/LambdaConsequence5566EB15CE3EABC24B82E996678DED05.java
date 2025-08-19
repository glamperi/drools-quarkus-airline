package org.acme.P55;


import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence5566EB15CE3EABC24B82E996678DED05 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "20454A1D877567B0E8841A6B0EC11617";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $1) throws java.lang.Exception {
        {
            {
                ($1).setCustomerCompensation($1.getCustomerCompensation() + 50.0);
            }
            {
                ($1).setApproved(true);
            }
            drools.update($1, mask_$1);
            drools.update($1, mask_$1);
        }
    }
}
