package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;
import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;

public class Rulesca50d071e601484ba72f9651b55e5575_rule_Cancellation_32Compensation_32Cap {

    /**
     * Rule name: Cancellation Compensation Cap
     */
    public static org.drools.model.Rule rule_Cancellation_32Compensation_32Cap() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Cancellation Compensation Cap")
                                      .build(D.pattern(var_$issue).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                        org.acme.P89.LambdaPredicate89B600575D0A18B2106CBB1172601636.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P62.LambdaExtractor6223BCDFC3C4AFAE2EE3414A7E4DE1FA.INSTANCE,
                                                                                         "cancellation"),
                                                                        D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.P02.LambdaConsequence0240B3EE7B1A4387E3AC037DBDC8B523.INSTANCE));
        return rule;
    }
}
