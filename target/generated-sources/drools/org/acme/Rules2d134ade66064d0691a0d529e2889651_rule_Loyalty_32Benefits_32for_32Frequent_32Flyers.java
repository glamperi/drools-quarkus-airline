package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;

public class Rules2d134ade66064d0691a0d529e2889651_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$1).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                    org.acme.PC5.LambdaPredicateC5236C077BE1EB069BB85CAEAD4741E1.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                     org.acme.P26.LambdaExtractor268BC0607B78E12B558CB0548D05CCB9.INSTANCE,
                                                                                     "gold"),
                                                                    D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                             org.acme.P16.LambdaPredicate16DD0988CEC42B2FA1642F8B99249F2F.INSTANCE,
                                                                                                             D.alphaIndexedBy(java.lang.String.class,
                                                                                                                              org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                              DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                              org.acme.P83.LambdaExtractor83BDF6A011A98EE0D7B17146A6AC7BD4.INSTANCE,
                                                                                                                              "cancellation"),
                                                                                                             D.reactOn("issueType")),
                                             D.on(var_$1).execute(org.acme.P55.LambdaConsequence5566EB15CE3EABC24B82E996678DED05.INSTANCE));
        return rule;
    }
}
