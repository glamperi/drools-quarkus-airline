package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;

public class Rules2d134ade66064d0691a0d529e2889651_rule_Cancellation_32Compensation_32Cap {

    /**
     * Rule name: Cancellation Compensation Cap
     */
    public static org.drools.model.Rule rule_Cancellation_32Compensation_32Cap() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Cancellation Compensation Cap")
                                      .build(D.pattern(var_$1).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                    org.acme.P16.LambdaPredicate16DD0988CEC42B2FA1642F8B99249F2F.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                     org.acme.P83.LambdaExtractor83BDF6A011A98EE0D7B17146A6AC7BD4.INSTANCE,
                                                                                     "cancellation"),
                                                                    D.reactOn("issueType")),
                                             D.on(var_$1).execute(org.acme.P73.LambdaConsequence73453EC322B648F474356A790D23751B.INSTANCE));
        return rule;
    }
}
