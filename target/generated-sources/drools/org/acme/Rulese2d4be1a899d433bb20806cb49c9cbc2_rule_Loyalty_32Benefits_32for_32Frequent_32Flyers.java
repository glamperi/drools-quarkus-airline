package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;

public class Rulese2d4be1a899d433bb20806cb49c9cbc2_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$issue).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                        org.acme.PB4.LambdaPredicateB45D6F15B46549FD887C7460C9219C3C.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                         org.acme.PBD.LambdaExtractorBDC1387A81AFE62970F71BD05E3F4415.INSTANCE,
                                                                                         "gold"),
                                                                        D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                                 org.acme.PFE.LambdaPredicateFEF632BBE8F2131FD374DA9B8183B496.INSTANCE,
                                                                                                                 D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                  DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                                  org.acme.PD3.LambdaExtractorD310C0AA94E852B01C9858720552F2FD.INSTANCE,
                                                                                                                                  "cancellation"),
                                                                                                                 D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.PBD.LambdaConsequenceBD944D41E8FAC8B189F7512400B55954.INSTANCE));
        return rule;
    }
}
