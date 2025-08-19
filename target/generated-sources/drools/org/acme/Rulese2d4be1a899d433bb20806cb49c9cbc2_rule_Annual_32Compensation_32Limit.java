package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;

public class Rulese2d4be1a899d433bb20806cb49c9cbc2_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$issue).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                        org.acme.P84.LambdaPredicate8478E7FD75766BE8783C92DC0F8BDE22.INSTANCE,
                                                                        D.alphaIndexedBy(double.class,
                                                                                         org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                         DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                         org.acme.PFB.LambdaExtractorFB967ABFCA487FCAC805AF31BE33774D.INSTANCE,
                                                                                         500.0),
                                                                        D.reactOn("customerCompensation")),
                                             D.on(var_$issue).execute(org.acme.P6F.LambdaConsequence6F6DFCC3C04F001FC414EE2087063C1D.INSTANCE));
        return rule;
    }
}
