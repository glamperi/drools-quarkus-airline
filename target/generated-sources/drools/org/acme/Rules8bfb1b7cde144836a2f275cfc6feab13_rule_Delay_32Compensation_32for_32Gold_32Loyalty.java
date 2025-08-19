package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;

public class Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Delay_32Compensation_32for_32Gold_32Loyalty {

    /**
     * Rule name: Delay Compensation for Gold Loyalty
     */
    public static org.drools.model.Rule rule_Delay_32Compensation_32for_32Gold_32Loyalty() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Delay Compensation for Gold Loyalty")
                                      .build(D.pattern(var_$1).expr("GENERATED_C9469C6F9A41126D9BD16BD3CE006421",
                                                                    org.acme.PEA.LambdaPredicateEA7ECD3859180DFE2F8B73292C64BB67.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                     org.acme.PA4.LambdaExtractorA4A3D588A507D3F071E9361EACAB795D.INSTANCE,
                                                                                     "delay"),
                                                                    D.reactOn("issueType")).expr("GENERATED_4B448709C139964FF60AAF6153D427AB",
                                                                                                 org.acme.P5C.LambdaPredicate5C2940AF319BF3993C6A6AC76FEA06EB.INSTANCE,
                                                                                                 D.alphaIndexedBy(int.class,
                                                                                                                  org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                  DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueDuration"),
                                                                                                                  org.acme.P63.LambdaExtractor63DCB0EC8FF8A47DDD9BD50B586DE47B.INSTANCE,
                                                                                                                  2),
                                                                                                 D.reactOn("issueDuration")).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                                                                                  org.acme.P09.LambdaPredicate09E38F0DC41A74344314077B2BADCB79.INSTANCE,
                                                                                                                                  D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                                   org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                   DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                                                                                   org.acme.P01.LambdaExtractor01902A013B4A10B6B2CAE32768D44B7A.INSTANCE,
                                                                                                                                                   "gold"),
                                                                                                                                  D.reactOn("customerLoyaltyStatus")),
                                             D.on(var_$1).execute(org.acme.P92.LambdaConsequence92BED719FE1FC30CBCD7231ED5D04F71.INSTANCE));
        return rule;
    }
}
