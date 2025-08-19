package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;

public class Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Delay_32Compensation_32for_32Silver_32Loyalty {

    /**
     * Rule name: Delay Compensation for Silver Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Silver_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Silver Loyalty")
                                      .build(D.pattern(var_$1).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                    org.acme.PA7.LambdaPredicateA7ED25CD16CFFFCA7FD5E4F0B7B3BFE9.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                     org.acme.PB5.LambdaExtractorB534A3A765070435611FAFA9503AA9AD.INSTANCE,
                                                                                     "delay"),
                                                                    D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                 org.acme.P8C.LambdaPredicate8C4726EC70207AC225C3D832DF926054.INSTANCE,
                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                  DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                  org.acme.PD8.LambdaExtractorD8E7B8735B4AE8B080D7F054A7D3A093.INSTANCE,
                                                                                                                  2),
                                                                                                 D.reactOn("issueDuration")).expr("GENERATED_65A9D3A716479C5194F3A4A81D11552A",
                                                                                                                                  org.acme.PD2.LambdaPredicateD257A813D07F06E6F5794D99E3F31E7D.INSTANCE,
                                                                                                                                  D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                   org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                   DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                   org.acme.P77.LambdaExtractor77F94FA5EB9D0C476B258E6251A15AB6.INSTANCE,
                                                                                                                                                   "silver"),
                                                                                                                                  D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$1).execute(org.acme.PB5.LambdaConsequenceB5248ABEA673B42FBA700C263FF3A911.INSTANCE));
        return rule;
    }
}
