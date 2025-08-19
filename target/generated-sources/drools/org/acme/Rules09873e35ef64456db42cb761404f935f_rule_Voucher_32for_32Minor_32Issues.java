package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules09873e35ef64456db42cb761404f935f.*;
import static org.acme.Rules09873e35ef64456db42cb761404f935f.*;

public class Rules09873e35ef64456db42cb761404f935f_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P1B.LambdaPredicate1B66B525D9D96F954E86908E05EE6D89.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P7A.LambdaExtractor7A89327746C440AD3AD3046B587327B3.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                     org.acme.P03.LambdaPredicate03073EC9B9D2C7E62AE46E68DF63C52A.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                      DomainClassesMetadata09873e35ef64456db42cb761404f935f.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.PEC.LambdaExtractorEC7634FECD2F5D0D6567C4F2CC91F771.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")),
                                             D.on(var_$issue).execute(org.acme.P6C.LambdaConsequence6C9262424291CEB3F908E417285A7EFB.INSTANCE));
        return rule;
    }
}
