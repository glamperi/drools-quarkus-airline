package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;

public class Rules0d704bd787224145a32b52ccd6e3f796_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$1).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                    org.acme.PBB.LambdaPredicateBB0A2F310BEB6FF11882798022C5F667.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                     org.acme.PDD.LambdaExtractorDD8672EF4AA45580ABEDF9BA129720FB.INSTANCE,
                                                                                     "gold"),
                                                                    D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                             org.acme.P1B.LambdaPredicate1B10DC7B03C0414F722A4E9D8F2A4089.INSTANCE,
                                                                                                             D.alphaIndexedBy(java.lang.String.class,
                                                                                                                              org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                              DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                              org.acme.P88.LambdaExtractor885C845FBF729A53511483950EC7E16D.INSTANCE,
                                                                                                                              "cancellation"),
                                                                                                             D.reactOn("issueType")),
                                             D.on(var_$1).execute(org.acme.P22.LambdaConsequence227F32BBE85446A34DC817BB52B9532B.INSTANCE));
        return rule;
    }
}
