package org.acme.PE3;


import static org.acme.Rules56703430c8c342a0a3a503669e5db7ff.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceE35F4E9D9370BBAC9910C007C7AACAC3 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "176C383F2595943F0D95FB34E5247BED";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata56703430c8c342a0a3a503669e5db7ff.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        $issue.setCustomerCompensation(0.0);
        drools.update($issue, mask_$issue);
        System.out.println("Offer voucher for future flight");
    }
}
