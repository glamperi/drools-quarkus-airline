package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;

public class Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$1).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                    org.acme.P22.LambdaPredicate2204CD1DCC96A122FB1A8BD63E730092.INSTANCE,
                                                                    D.alphaIndexedBy(double.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                     org.acme.P85.LambdaExtractor85B35931C509CC19AE911524600A2C71.INSTANCE,
                                                                                     500.0),
                                                                    D.reactOn("customerCompensation")),
                                             D.on(var_$1).execute(org.acme.P4F.LambdaConsequence4F37F30436630255C473A0FC37FBB1F1.INSTANCE));
        return rule;
    }
}
