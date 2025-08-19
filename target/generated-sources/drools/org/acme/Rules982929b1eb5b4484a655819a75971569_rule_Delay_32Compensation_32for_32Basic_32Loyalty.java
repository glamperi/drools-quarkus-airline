package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules982929b1eb5b4484a655819a75971569.*;
import static org.acme.Rules982929b1eb5b4484a655819a75971569.*;

public class Rules982929b1eb5b4484a655819a75971569_rule_Delay_32Compensation_32for_32Basic_32Loyalty {

    /**
     * Rule name: Delay Compensation for Basic Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Basic_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata982929b1eb5b4484a655819a75971569.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata982929b1eb5b4484a655819a75971569.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Basic Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.PFD.LambdaPredicateFDAF374D3A4C49D45B3C78D741076913.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata982929b1eb5b4484a655819a75971569.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P07.LambdaExtractor07B528581635EAB05ADDEEE06DAFEE93.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P96.LambdaPredicate964714D503059E74D08A042B3E5520BD.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadata982929b1eb5b4484a655819a75971569.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PB5.LambdaExtractorB582465FA1F5457AB401AA997121B237.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_8B14C44E0A698D42023A187449B51D63",
                                                                                                                                      org.acme.P67.LambdaPredicate67949456D48B56ECAC7A3CFE145A1F4E.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadata982929b1eb5b4484a655819a75971569.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.PE3.LambdaExtractorE3E23262A786A428D529E7FE48D03431.INSTANCE,
                                                                                                                                                       "basic"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.P8D.LambdaConsequence8D3CDCA7051C2E3D5961A9F090739B81.INSTANCE));
        return rule;
    }
}
