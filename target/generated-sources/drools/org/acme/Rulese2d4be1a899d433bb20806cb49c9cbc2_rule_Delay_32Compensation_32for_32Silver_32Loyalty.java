package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;

public class Rulese2d4be1a899d433bb20806cb49c9cbc2_rule_Delay_32Compensation_32for_32Silver_32Loyalty {

    /**
     * Rule name: Delay Compensation for Silver Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Silver_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Silver Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P08.LambdaPredicate08D15A4B2A562AC588F3802550AA06AC.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.PD3.LambdaExtractorD310C0AA94E852B01C9858720552F2FD.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P6C.LambdaPredicate6C8FB6B5BE27A0D2CF98515F90AB87D1.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PFD.LambdaExtractorFDD159136F67221BA5D68BD4816F09AF.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_65A9D3A716479C5194F3A4A81D11552A",
                                                                                                                                      org.acme.P0F.LambdaPredicate0FA389D82CCEA5DDCCD0A4CA6F4126DE.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.PBD.LambdaExtractorBDC1387A81AFE62970F71BD05E3F4415.INSTANCE,
                                                                                                                                                       "silver"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.P5B.LambdaConsequence5B1CBE3568F011B1BBFD38878AE97280.INSTANCE));
        return rule;
    }
}
