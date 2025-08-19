package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules915dcf213b7c4890a138331bce80a1c9.*;
import static org.acme.Rules915dcf213b7c4890a138331bce80a1c9.*;

public class Rules915dcf213b7c4890a138331bce80a1c9_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata915dcf213b7c4890a138331bce80a1c9.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata915dcf213b7c4890a138331bce80a1c9.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P27.LambdaPredicate274714C71D15ACB4A74DC67ECC26372E.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata915dcf213b7c4890a138331bce80a1c9.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.PDB.LambdaExtractorDB833FEE99C74463721B40DD6C2A8214.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                     org.acme.P71.LambdaPredicate71DD38B30FC8F19CD6CFD1A6AD90A586.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                      DomainClassesMetadata915dcf213b7c4890a138331bce80a1c9.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P62.LambdaExtractor626351D96A9F1CEEBFD5DF27B7655445.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")),
                                             D.on(var_$issue).execute(org.acme.PA0.LambdaConsequenceA05FDB6D00F530320C75CDFED0524672.INSTANCE));
        return rule;
    }
}
