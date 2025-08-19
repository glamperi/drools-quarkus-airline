package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;
import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;

public class Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$issue).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                        org.acme.PB3.LambdaPredicateB3136C370F5F4CA3B53CDF16F9FE27C9.INSTANCE,
                                                                        D.alphaIndexedBy(double.class,
                                                                                         org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                         DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                         org.acme.PC0.LambdaExtractorC002603DFAC4EDE6F0449618092676E6.INSTANCE,
                                                                                         500.0),
                                                                        D.reactOn("customerCompensation")),
                                             D.on(var_$issue).execute(org.acme.P47.LambdaConsequence4711D327E39A37F1371B6D121990B909.INSTANCE));
        return rule;
    }
}
