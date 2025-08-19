package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules3be6c565a99a41e2ad1ffda02acdfc27.*;
import static org.acme.Rules3be6c565a99a41e2ad1ffda02acdfc27.*;

public class Rules3be6c565a99a41e2ad1ffda02acdfc27_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$issue).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                        org.acme.P89.LambdaPredicate89BE9D79A81F8402C07CC2CD2D723CE2.INSTANCE,
                                                                        D.alphaIndexedBy(double.class,
                                                                                         org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                         DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                         org.acme.P74.LambdaExtractor7472E4456E82989190E89734345D85C1.INSTANCE,
                                                                                         500.0),
                                                                        D.reactOn("customerCompensation")),
                                             D.on(var_$issue).execute(org.acme.P09.LambdaConsequence091C0DD425776B859AD0940E79718476.INSTANCE));
        return rule;
    }
}
