package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules126441f3ebc549f6b4abc3628813b14a.*;
import static org.acme.Rules126441f3ebc549f6b4abc3628813b14a.*;

public class Rules126441f3ebc549f6b4abc3628813b14a_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata126441f3ebc549f6b4abc3628813b14a.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata126441f3ebc549f6b4abc3628813b14a.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$issue).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                        org.acme.P3D.LambdaPredicate3D1A47FFFAE438367CD7DAD97905DDDE.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadata126441f3ebc549f6b4abc3628813b14a.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.PDA.LambdaExtractorDA4EBC9412E0065E354397D76778DC64.INSTANCE,
                                                                                         "delay"),
                                                                        D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                     org.acme.P83.LambdaPredicate835C1DC11F7502B8CB2FAED94E193C0D.INSTANCE,
                                                                                                     D.alphaIndexedBy(int.class,
                                                                                                                      org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                      DomainClassesMetadata126441f3ebc549f6b4abc3628813b14a.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                      org.acme.P3F.LambdaExtractor3FEA4ABAA65E6C4CFBCF38A24E5CF19E.INSTANCE,
                                                                                                                      2),
                                                                                                     D.reactOn("issueDuration")),
                                             D.on(var_$issue).execute(org.acme.P52.LambdaConsequence528A9881949FEFDA6F5814FE18318F4E.INSTANCE));
        return rule;
    }
}
