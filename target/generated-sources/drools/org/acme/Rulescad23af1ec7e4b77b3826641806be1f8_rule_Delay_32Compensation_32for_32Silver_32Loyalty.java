package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulescad23af1ec7e4b77b3826641806be1f8.*;
import static org.acme.Rulescad23af1ec7e4b77b3826641806be1f8.*;

public class Rulescad23af1ec7e4b77b3826641806be1f8_rule_Delay_32Compensation_32for_32Silver_32Loyalty {

    /**
     * Rule name: Delay Compensation for Silver Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Silver_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Silver Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.PC4.LambdaPredicateC4EE3DC2A7994FC368BCA7E09DDB9E3D.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P4E.LambdaExtractor4E2557A17BC0CCB9BF4BE1657F5D5FD8.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P03.LambdaPredicate0307C3732BB8B2FD975D3C6EB4178982.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PDC.LambdaExtractorDC27C2856F4F0237EC7D57A13F151491.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_65A9D3A716479C5194F3A4A81D11552A",
                                                                                                                                      org.acme.P6D.LambdaPredicate6D9023DE3196E068637A46DCB738E914.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadatacad23af1ec7e4b77b3826641806be1f8.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.P07.LambdaExtractor07281564613926D16D821E068A832535.INSTANCE,
                                                                                                                                                       "silver"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.PEC.LambdaConsequenceEC24D54AA72EFEE4A662F7A1C68E14AE.INSTANCE));
        return rule;
    }
}
