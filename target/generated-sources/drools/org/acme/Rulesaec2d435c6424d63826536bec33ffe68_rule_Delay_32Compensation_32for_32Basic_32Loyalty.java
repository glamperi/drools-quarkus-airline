package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;

public class Rulesaec2d435c6424d63826536bec33ffe68_rule_Delay_32Compensation_32for_32Basic_32Loyalty {

    /**
     * Rule name: Delay Compensation for Basic Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Basic_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Basic Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P67.LambdaPredicate67E22514195762C5B0E2FAE1F623D714.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.PAC.LambdaExtractorACF91512BC9F49315DC6413E35A5F050.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.PE1.LambdaPredicateE187CB35984829713BEC487A4BE38C0F.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PB6.LambdaExtractorB679E7EE8A2C2DD73EB267D5E222D722.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_8B14C44E0A698D42023A187449B51D63",
                                                                                                                                      org.acme.PC7.LambdaPredicateC7BE495232E63617AEAB455AF973100A.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.PA7.LambdaExtractorA7C9B429C0E83B63DBFCEC6FBDEBC72A.INSTANCE,
                                                                                                                                                       "basic"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.PE5.LambdaConsequenceE5D29218210D566A1E801836D8EC82B9.INSTANCE));
        return rule;
    }
}
