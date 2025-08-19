package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;

public class Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Voucher_32for_32Minor_32Issues {

    /**
     * Rule name: Voucher for Minor Issues
     */
    public static org.drools.model.Rule rule_Voucher_32for_32Minor_32Issues() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Voucher for Minor Issues")
                                      .build(D.pattern(var_$1).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                    org.acme.PEA.LambdaPredicateEA7ECD3859180DFE2F8B73292C64BB67.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                     org.acme.PA4.LambdaExtractorA4A3D588A507D3F071E9361EACAB795D.INSTANCE,
                                                                                     "delay"),
                                                                    D.reactOn("issueType")).expr("GENERATED_4727989808EEA8B7E87C99382601B74E",
                                                                                                 org.acme.P23.LambdaPredicate233A39E13D20A4B5E949BAE4B29821B8.INSTANCE,
                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                  org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                  DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                  org.acme.P63.LambdaExtractor63DCB0EC8FF8A47DDD9BD50B586DE47B.INSTANCE,
                                                                                                                  2),
                                                                                                 D.reactOn("issueDuration")),
                                             D.on(var_$1).execute(org.acme.PB2.LambdaConsequenceB2B047F99D1A9C97A40C0DBE934716B5.INSTANCE));
        return rule;
    }
}
