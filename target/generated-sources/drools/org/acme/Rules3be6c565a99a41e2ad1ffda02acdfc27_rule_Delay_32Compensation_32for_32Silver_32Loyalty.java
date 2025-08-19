package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules3be6c565a99a41e2ad1ffda02acdfc27.*;
import static org.acme.Rules3be6c565a99a41e2ad1ffda02acdfc27.*;

public class Rules3be6c565a99a41e2ad1ffda02acdfc27_rule_Delay_32Compensation_32for_32Silver_32Loyalty {

    /**
     * Rule name: Delay Compensation for Silver Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Silver_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Silver Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.PDD.LambdaPredicateDDB559D3C524AEF0BB34D087FBF675A9.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P4E.LambdaExtractor4E4450BE4C013EB658D0814823534F17.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P44.LambdaPredicate44BB452A48AFEE54C30C412ACCE8C613.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P69.LambdaExtractor698217F5058720DC570F8BC923C7CC01.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_65A9D3A716479C5194F3A4A81D11552A",
                                                                                                                                      org.acme.P6A.LambdaPredicate6AD1CE30D8423B67A8D0FABFA87E7C2C.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadata3be6c565a99a41e2ad1ffda02acdfc27.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.P17.LambdaExtractor170BD29935CF8B78208054128F5AC004.INSTANCE,
                                                                                                                                                       "silver"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.P54.LambdaConsequence54F986D1B977DE72B1AFEE238F82F689.INSTANCE));
        return rule;
    }
}
