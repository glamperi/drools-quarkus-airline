package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulescad23af1ec7e4b77b3826641806be1f8.*;
import static org.acme.Rulescad23af1ec7e4b77b3826641806be1f8.*;

public class Rulescad23af1ec7e4b77b3826641806be1f8_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$issue).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                        org.acme.P68.LambdaPredicate68BA27545BD7229E08EFC268F8AB4DD8.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                         org.acme.P07.LambdaExtractor07281564613926D16D821E068A832535.INSTANCE,
                                                                                         "gold"),
                                                                        D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                                 org.acme.PEF.LambdaPredicateEFBF4EE1CF215AB97526E545A0447AD8.INSTANCE,
                                                                                                                 D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                  DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                                  org.acme.P4E.LambdaExtractor4E2557A17BC0CCB9BF4BE1657F5D5FD8.INSTANCE,
                                                                                                                                  "cancellation"),
                                                                                                                 D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.P21.LambdaConsequence21EA456587A053BA4350E6745EC27746.INSTANCE));
        return rule;
    }
}
