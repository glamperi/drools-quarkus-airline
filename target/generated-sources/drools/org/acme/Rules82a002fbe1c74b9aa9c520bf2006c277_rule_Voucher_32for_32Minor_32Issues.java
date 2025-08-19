package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules82a002fbe1c74b9aa9c520bf2006c277.*;
import static org.acme.Rules82a002fbe1c74b9aa9c520bf2006c277.*;

public class Rules82a002fbe1c74b9aa9c520bf2006c277_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P41.LambdaPredicate4150DB069E0E7FBF7838801829225BEA.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P10.LambdaExtractor10274B9A586110FC8654271819FB1A7D.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                     org.acme.P1C.LambdaPredicate1C5AD5F6BA671CA17A778CEA67AF052C.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                      DomainClassesMetadata82a002fbe1c74b9aa9c520bf2006c277.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P17.LambdaExtractor174FA80C996604642CB627CD7D5F350A.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")),
                                             D.on(var_$issue).execute(org.acme.PCB.LambdaConsequenceCB057ABCF0FAC3B2E951E717D3DEA140.INSTANCE));
        return rule;
    }
}
