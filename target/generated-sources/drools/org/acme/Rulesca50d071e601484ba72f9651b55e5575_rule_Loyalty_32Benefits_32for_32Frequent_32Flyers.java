package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;
import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;

public class Rulesca50d071e601484ba72f9651b55e5575_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$issue).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                        org.acme.P16.LambdaPredicate1609274A2919DFBC0A892F4655933441.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                         org.acme.PA3.LambdaExtractorA30BB5969BAB4CEA8EA33238B576D7F3.INSTANCE,
                                                                                         "gold"),
                                                                        D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                                 org.acme.P89.LambdaPredicate89B600575D0A18B2106CBB1172601636.INSTANCE,
                                                                                                                 D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                  DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                                  org.acme.P62.LambdaExtractor6223BCDFC3C4AFAE2EE3414A7E4DE1FA.INSTANCE,
                                                                                                                                  "cancellation"),
                                                                                                                 D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.P40.LambdaConsequence407C620C887C85AD2E64DF5851C43D37.INSTANCE));
        return rule;
    }
}
