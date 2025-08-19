package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;
import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;

public class Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P07.LambdaPredicate07889146E8C488E19F5058BBDBF12422.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P6A.LambdaExtractor6ADB8FB82F2F3A9404EE6E24F0049E41.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                     org.acme.PBE.LambdaPredicateBEF9C9B6681DD2C54DFC5FBD0C240F9B.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                      DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P23.LambdaExtractor23A265C6637F8114613B561A639C742C.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")),
                                             D.on(var_$issue).execute(org.acme.PF9.LambdaConsequenceF919FF84D244AFE04AAAF600DC22AA57.INSTANCE));
        return rule;
    }
}
