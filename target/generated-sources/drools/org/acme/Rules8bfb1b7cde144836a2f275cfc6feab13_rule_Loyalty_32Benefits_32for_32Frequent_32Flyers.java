package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;

public class Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$1).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                    org.acme.P09.LambdaPredicate09E38F0DC41A74344314077B2BADCB79.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                     org.acme.P01.LambdaExtractor01902A013B4A10B6B2CAE32768D44B7A.INSTANCE,
                                                                                     "gold"),
                                                                    D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                             org.acme.PA5.LambdaPredicateA5C7B8807B63819FFDC0791942124C52.INSTANCE,
                                                                                                             D.alphaIndexedBy(java.lang.String.class,
                                                                                                                              org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                              DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                              org.acme.PA4.LambdaExtractorA4A3D588A507D3F071E9361EACAB795D.INSTANCE,
                                                                                                                              "cancellation"),
                                                                                                             D.reactOn("issueType")),
                                             D.on(var_$1).execute(org.acme.P48.LambdaConsequence48FE03E45B6B1EBEC6DBDAED5981D7F6.INSTANCE));
        return rule;
    }
}
