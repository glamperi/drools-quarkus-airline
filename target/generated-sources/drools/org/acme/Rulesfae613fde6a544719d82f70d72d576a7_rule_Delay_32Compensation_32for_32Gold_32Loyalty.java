package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesfae613fde6a544719d82f70d72d576a7.*;
import static org.acme.Rulesfae613fde6a544719d82f70d72d576a7.*;

public class Rulesfae613fde6a544719d82f70d72d576a7_rule_Delay_32Compensation_32for_32Gold_32Loyalty {

    /**
     * Rule name: Delay Compensation for Gold Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Gold_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatafae613fde6a544719d82f70d72d576a7.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafae613fde6a544719d82f70d72d576a7.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Gold Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P73.LambdaPredicate730E880891AB0C54502DB55012B9030F.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatafae613fde6a544719d82f70d72d576a7.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P0D.LambdaExtractor0D85F4031DF47D2C6100F11A9EEA53CF.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.PEE.LambdaPredicateEE828C6DFCCCD7B785A5D0E4269597E7.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadatafae613fde6a544719d82f70d72d576a7.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P2E.LambdaExtractor2E73ACC44BE266DD3BA5A28F32FA5751.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                                                                                      org.acme.P43.LambdaPredicate4356594A15B3E54CB559EB9C03D0D554.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadatafae613fde6a544719d82f70d72d576a7.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.P7F.LambdaExtractor7FB0687646B6EA854A9E196151B57E44.INSTANCE,
                                                                                                                                                       "gold"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.P80.LambdaConsequence80F2ACA3F0C7F1B8E35AF16E054DE38C.INSTANCE));
        return rule;
    }
}
