package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese9d1c29b0e6944ce97de0eb96c49ee37.*;
import static org.acme.Rulese9d1c29b0e6944ce97de0eb96c49ee37.*;

public class Rulese9d1c29b0e6944ce97de0eb96c49ee37_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae9d1c29b0e6944ce97de0eb96c49ee37.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae9d1c29b0e6944ce97de0eb96c49ee37.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$issue).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                        org.acme.PFC.LambdaPredicateFC17F60C5471F58B2EC7957B371C6981.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatae9d1c29b0e6944ce97de0eb96c49ee37.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                         org.acme.PF8.LambdaExtractorF86E274D2A20397B1519ADF00C8F3EE5.INSTANCE,
                                                                                         "gold"),
                                                                        D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                                 org.acme.PED.LambdaPredicateED1C0CAE31E4007C7B3F5226C4748F07.INSTANCE,
                                                                                                                 D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                  DomainClassesMetadatae9d1c29b0e6944ce97de0eb96c49ee37.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                                  org.acme.P33.LambdaExtractor33D56CB75451BCC4B87172ED7371EF41.INSTANCE,
                                                                                                                                  "cancellation"),
                                                                                                                 D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.PCB.LambdaConsequenceCB79B84E7DBE48A9F072C70C225284E9.INSTANCE));
        return rule;
    }
}
