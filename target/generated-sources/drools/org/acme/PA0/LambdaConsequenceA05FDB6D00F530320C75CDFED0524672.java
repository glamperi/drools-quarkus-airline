package org.acme.PA0;


import static org.acme.Rules915dcf213b7c4890a138331bce80a1c9.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceA05FDB6D00F530320C75CDFED0524672 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "176C383F2595943F0D95FB34E5247BED";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata915dcf213b7c4890a138331bce80a1c9.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        $issue.setCustomerCompensation(0.0);
        drools.update($issue, mask_$issue);
        System.out.println("Offer voucher for future flight");
    }
}
