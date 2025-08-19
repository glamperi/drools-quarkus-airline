package org.acme.P65;


import static org.acme.Rulesfae613fde6a544719d82f70d72d576a7.*;
import org.acme.*;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence65F4C84C867FE3E77A9B9D65F1EF9F6B implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.FlightIssue>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "2D9694AADBDCE6341986BABA9C85AEB2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafae613fde6a544719d82f70d72d576a7.org_acme_FlightIssue_Metadata_INSTANCE, "customerCompensation");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.FlightIssue $issue) throws java.lang.Exception {
        $issue.setCustomerCompensation(Math.min($issue.getCustomerCompensation(), 200.0));
        drools.update($issue, mask_$issue);
    }
}
