package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;

public class Rules0d704bd787224145a32b52ccd6e3f796_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$1).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                    org.acme.P79.LambdaPredicate7985C88FBA3AFB1F19B61202831E7F8E.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                     org.acme.P88.LambdaExtractor885C845FBF729A53511483950EC7E16D.INSTANCE,
                                                                                     "delay"),
                                                                    D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                 org.acme.PE2.LambdaPredicateE23EDFB2ED91176CFD0356FB8E3D3F19.INSTANCE,
                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                  org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                  DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                  org.acme.P88.LambdaExtractor881C2B107165D9E41BCD6F7DFB7A631F.INSTANCE,
                                                                                                                  2),
                                                                                                 D.reactOn("issueDuration")),
                                             D.on(var_$1).execute(org.acme.P53.LambdaConsequence53F4066507551CFDE9B80144B05FAA08.INSTANCE));
        return rule;
    }
}
