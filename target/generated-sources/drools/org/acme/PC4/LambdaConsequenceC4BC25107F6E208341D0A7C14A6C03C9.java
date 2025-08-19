package org.acme.PC4;


import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceC4BC25107F6E208341D0A7C14A6C03C9 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "D1CBB05C76C44D61C8724FB20F6D6D20";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE, "approved", "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        {
            $issue.setCustomerCompensation(500.0 - CompensationHelper.getPreviousCompensationThisYear());
            {
                ($issue).setApproved(true);
            }
            drools.update($issue, mask_$issue);
            drools.update($issue, mask_$issue);
        }
    }
}
