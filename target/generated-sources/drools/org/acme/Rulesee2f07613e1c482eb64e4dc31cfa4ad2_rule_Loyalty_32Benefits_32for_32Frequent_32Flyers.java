package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;

public class Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$1).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                    org.acme.PB8.LambdaPredicateB8D3F5BA6FAF3B4D32062162E2E84B55.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                     org.acme.P77.LambdaExtractor77F94FA5EB9D0C476B258E6251A15AB6.INSTANCE,
                                                                                     "gold"),
                                                                    D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                             org.acme.PA4.LambdaPredicateA406831D7E5E1264E5D22EFDF6299C5D.INSTANCE,
                                                                                                             D.alphaIndexedBy(java.lang.String.class,
                                                                                                                              org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                              DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                              org.acme.PB5.LambdaExtractorB534A3A765070435611FAFA9503AA9AD.INSTANCE,
                                                                                                                              "cancellation"),
                                                                                                             D.reactOn("issueType")),
                                             D.on(var_$1).execute(org.acme.PE0.LambdaConsequenceE02823A252275124F9B98B2D6B52A6EC.INSTANCE));
        return rule;
    }
}
