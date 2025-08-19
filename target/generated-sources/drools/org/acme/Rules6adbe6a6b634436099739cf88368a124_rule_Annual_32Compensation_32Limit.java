package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;
import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;

public class Rules6adbe6a6b634436099739cf88368a124_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$issue).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                        org.acme.P1D.LambdaPredicate1DDD47C2C7FEFB5D167E71CC660BC248.INSTANCE,
                                                                        D.alphaIndexedBy(double.class,
                                                                                         org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                         DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                         org.acme.P8C.LambdaExtractor8CB001347C49540B11133687C5CE5523.INSTANCE,
                                                                                         500.0),
                                                                        D.reactOn("customerCompensation")),
                                             D.on(var_$issue).execute(org.acme.PC4.LambdaConsequenceC4BC25107F6E208341D0A7C14A6C03C9.INSTANCE));
        return rule;
    }
}
