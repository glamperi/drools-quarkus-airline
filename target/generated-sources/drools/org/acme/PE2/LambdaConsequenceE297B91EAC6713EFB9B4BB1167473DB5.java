package org.acme.PE2;


import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceE297B91EAC6713EFB9B4BB1167473DB5 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "DA036B7819B114055D8F4ADBA567CB8A";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        {
            $issue.setCustomerCompensation(0.0);
            {
                ($issue).setApproved(false);
            }
            drools.update($issue, mask_$issue);
            drools.update($issue, mask_$issue);
        }
    }
}
