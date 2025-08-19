package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;
import static org.acme.Rules6adbe6a6b634436099739cf88368a124.*;

public class Rules6adbe6a6b634436099739cf88368a124_rule_Delay_32Compensation_32for_32Basic_32Loyalty {

    /**
     * Rule name: Delay Compensation for Basic Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Basic_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Basic Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P8A.LambdaPredicate8A579C948676E5255D5F89FACDF6421E.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P63.LambdaExtractor6373811941AD783D6C39CFB46DC4DBD2.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P9F.LambdaPredicate9F07B4E652EA92E88DDCCEF079010A3D.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P23.LambdaExtractor23B2B9743F77711746B14EB46DA6DB60.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_8B14C44E0A698D42023A187449B51D63",
                                                                                                                                      org.acme.P67.LambdaPredicate67B0625B629CA7101DEDE21C5DE663B0.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadata6adbe6a6b634436099739cf88368a124.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.P63.LambdaExtractor63D6569323615C8DFD86F09DA005F64F.INSTANCE,
                                                                                                                                                       "basic"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.P44.LambdaConsequence44D17778DB34737602D79FDAB9EBE198.INSTANCE));
        return rule;
    }
}
