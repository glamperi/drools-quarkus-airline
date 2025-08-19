package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules1dae3899e63143dda2fff67e21fb3b02.*;
import static org.acme.Rules1dae3899e63143dda2fff67e21fb3b02.*;

public class Rules1dae3899e63143dda2fff67e21fb3b02_rule_Cancellation_32Compensation_32Cap {

    /**
     * Rule name: Cancellation Compensation Cap
     */
    public static org.drools.model.Rule rule_Cancellation_32Compensation_32Cap() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata1dae3899e63143dda2fff67e21fb3b02.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata1dae3899e63143dda2fff67e21fb3b02.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Cancellation Compensation Cap")
                                      .build(D.pattern(var_$issue).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                        org.acme.P8F.LambdaPredicate8F4B2D09479CA86BBB3FE62133ED9028.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata1dae3899e63143dda2fff67e21fb3b02.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P5A.LambdaExtractor5AD4771B60040CAD902C969229C248EF.INSTANCE,
                                                                                         "cancellation"),
                                                                        D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.PD1.LambdaConsequenceD15C49D3FB501204E86DD0028AB3F5BE.INSTANCE));
        return rule;
    }
}
