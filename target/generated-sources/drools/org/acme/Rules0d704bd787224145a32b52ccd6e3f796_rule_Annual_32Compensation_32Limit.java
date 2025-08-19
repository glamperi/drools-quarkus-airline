package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;

public class Rules0d704bd787224145a32b52ccd6e3f796_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$1).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                    org.acme.PF4.LambdaPredicateF422116DA0627E18D64EB0C83CE7BC87.INSTANCE,
                                                                    D.alphaIndexedBy(double.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                     org.acme.PDE.LambdaExtractorDEDFF5064742303157EE81055D0F41A1.INSTANCE,
                                                                                     500.0),
                                                                    D.reactOn("customerCompensation")),
                                             D.on(var_$1).execute(org.acme.P4C.LambdaConsequence4CD2AC2DEA8CBFD6383B06FEC3B2AF24.INSTANCE));
        return rule;
    }
}
