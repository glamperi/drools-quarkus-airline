package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;

public class Rules2d134ade66064d0691a0d529e2889651_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$1).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                    org.acme.P9A.LambdaPredicate9A8A46C9868488CAA88CA6F42FCB8F57.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                     org.acme.P83.LambdaExtractor83BDF6A011A98EE0D7B17146A6AC7BD4.INSTANCE,
                                                                                     "delay"),
                                                                    D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                 org.acme.P45.LambdaPredicate45383DF4B6A0C2A985CEB7070A06BAD7.INSTANCE,
                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                  org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                  DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                  org.acme.P6C.LambdaExtractor6CBACB24DDA1676835DF390559F324BA.INSTANCE,
                                                                                                                  2),
                                                                                                 D.reactOn("issueDuration")),
                                             D.on(var_$1).execute(org.acme.PE5.LambdaConsequenceE58743A26EF9B61CB19C9B195ECEDEBF.INSTANCE));
        return rule;
    }
}
