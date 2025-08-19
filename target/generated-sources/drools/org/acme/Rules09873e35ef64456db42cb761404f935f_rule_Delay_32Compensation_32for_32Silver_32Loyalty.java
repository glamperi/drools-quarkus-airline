package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules09873e35ef64456db42cb761404f935f.*;
import static org.acme.Rules09873e35ef64456db42cb761404f935f.*;

public class Rules09873e35ef64456db42cb761404f935f_rule_Delay_32Compensation_32for_32Silver_32Loyalty {

    /**
     * Rule name: Delay Compensation for Silver Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Silver_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Silver Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P1B.LambdaPredicate1B66B525D9D96F954E86908E05EE6D89.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P7A.LambdaExtractor7A89327746C440AD3AD3046B587327B3.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.PCB.LambdaPredicateCB36974C1C5815000B4F8A8609616DC8.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PEC.LambdaExtractorEC7634FECD2F5D0D6567C4F2CC91F771.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_65A9D3A716479C5194F3A4A81D11552A",
                                                                                                                                      org.acme.P89.LambdaPredicate8959A74AC914E2E1ECBF578A200E7570.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.PAE.LambdaExtractorAE2D4DD4763EA695DFF4C5AC2E4F88F3.INSTANCE,
                                                                                                                                                       "silver"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.PA1.LambdaConsequenceA170EA5802521291E6787198720A5A4C.INSTANCE));
        return rule;
    }
}
