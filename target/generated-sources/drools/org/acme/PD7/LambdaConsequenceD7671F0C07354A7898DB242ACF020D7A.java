package org.acme.PD7;


import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceD7671F0C07354A7898DB242ACF020D7A implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "DFC90DB28035837FDB1C4B102318FCB7";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab02d21498133461ba0271c103a91de6f.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        {
            $issue.setCustomerCompensation(0.0);
            {
                ($issue).setApproved(false);
            }
            drools.update($issue, mask_$issue);
            System.out.println("Offer voucher for future flight");
            drools.update($issue, mask_$issue);
        }
    }
}
