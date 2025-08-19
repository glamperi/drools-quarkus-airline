package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;
import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;

public class Rulesb02d21498133461ba0271c103a91de6f_rule_Delay_32Compensation_32for_32Gold_32Loyalty {

    /**
     * Rule name: Delay Compensation for Gold Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Gold_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatab02d21498133461ba0271c103a91de6f.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab02d21498133461ba0271c103a91de6f.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Gold Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.PEE.LambdaPredicateEE3821E0CBE71D7B3456854315595E00.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatab02d21498133461ba0271c103a91de6f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P27.LambdaExtractor27374833357A8828FCBBC79542E9A3F8.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P5B.LambdaPredicate5B6254E855E5DD30F2F89130D2279285.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadatab02d21498133461ba0271c103a91de6f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PB8.LambdaExtractorB8292FA208ED0248C174C08515A53E79.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                                                                                      org.acme.PFD.LambdaPredicateFDD51F382681E8F23FBA6684DB0444E6.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadatab02d21498133461ba0271c103a91de6f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.P1F.LambdaExtractor1FEB8E9A6EE0F21C67BCCB2BEF7B1D4A.INSTANCE,
                                                                                                                                                       "gold"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.PAF.LambdaConsequenceAFD74A91B9791F8ACB1115EDB53B8B13.INSTANCE));
        return rule;
    }
}
