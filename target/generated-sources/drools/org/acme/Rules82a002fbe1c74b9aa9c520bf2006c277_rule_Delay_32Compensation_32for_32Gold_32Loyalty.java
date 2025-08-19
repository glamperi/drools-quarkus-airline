package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules82a002fbe1c74b9aa9c520bf2006c277.*;
import static org.acme.Rules82a002fbe1c74b9aa9c520bf2006c277.*;

public class Rules82a002fbe1c74b9aa9c520bf2006c277_rule_Delay_32Compensation_32for_32Gold_32Loyalty {

    /**
     * Rule name: Delay Compensation for Gold Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Gold_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Gold Loyalty")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P41.LambdaPredicate4150DB069E0E7FBF7838801829225BEA.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P10.LambdaExtractor10274B9A586110FC8654271819FB1A7D.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                     org.acme.P85.LambdaPredicate85EB6B57CAA25AF665DEC78C35C09FAC.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                      DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P17.LambdaExtractor174FA80C996604642CB627CD7D5F350A.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                                                                                      org.acme.PF8.LambdaPredicateF8691DA82CB29F490C7A7DDF02206DEF.INSTANCE,
                                                                                                                                      D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                       org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                       DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                       org.acme.P14.LambdaExtractor14AEDAAA51A5DF4C6A659BC75F5E4B58.INSTANCE,
                                                                                                                                                       "gold"),
                                                                                                                                      D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$issue).execute(org.acme.P6B.LambdaConsequence6BB51E3BA732768980F9A5801833CAFD.INSTANCE));
        return rule;
    }
}
