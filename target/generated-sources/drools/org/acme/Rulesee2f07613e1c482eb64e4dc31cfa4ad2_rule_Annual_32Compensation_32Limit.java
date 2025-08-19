package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;

public class Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$1).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                    org.acme.P3F.LambdaPredicate3FF7B3C43A5BB89E87FBC8C3D71CD1A4.INSTANCE,
                                                                    D.alphaIndexedBy(double.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                     org.acme.P6E.LambdaExtractor6E6D4214C0F95EE3DF37EDD13B87A63D.INSTANCE,
                                                                                     500.0),
                                                                    D.reactOn("customerCompensation")),
                                             D.on(var_$1).execute(org.acme.PD4.LambdaConsequenceD484C2F7FC92B8A316D736EDBC29E860.INSTANCE));
        return rule;
    }
}
