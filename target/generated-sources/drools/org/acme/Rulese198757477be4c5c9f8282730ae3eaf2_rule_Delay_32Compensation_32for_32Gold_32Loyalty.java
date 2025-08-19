package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese198757477be4c5c9f8282730ae3eaf2.*;
import static org.acme.Rulese198757477be4c5c9f8282730ae3eaf2.*;

public class Rulese198757477be4c5c9f8282730ae3eaf2_rule_Delay_32Compensation_32for_32Gold_32Loyalty {

    /**
     * Rule name: Delay Compensation for Gold Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Gold_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae198757477be4c5c9f8282730ae3eaf2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae198757477be4c5c9f8282730ae3eaf2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Gold Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.PCC.LambdaPredicateCC33EA87C54B5CA3F3727B8F0FE198F7.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatae198757477be4c5c9f8282730ae3eaf2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P66.LambdaExtractor66F503EB827C76E690ED641B44076D5C.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P6F.LambdaPredicate6FF1B6976633E42126512A26C50A37B7.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadatae198757477be4c5c9f8282730ae3eaf2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PDA.LambdaExtractorDA03A6D7E37EABBE5F9EEF4872C11D44.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                                                                                      org.acme.P94.LambdaPredicate94449A138A0223A089DEF9317AFEE65B.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadatae198757477be4c5c9f8282730ae3eaf2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.P9C.LambdaExtractor9C0FE63B5FB905199D0619F739009381.INSTANCE,
                                                                                                                                                       "gold"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.PB1.LambdaConsequenceB11096B3C6269E68F603C648BF30A635.INSTANCE));
        return rule;
    }
}
