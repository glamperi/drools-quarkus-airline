package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;

public class Rulesaec2d435c6424d63826536bec33ffe68_rule_Cancellation_32Compensation_32Cap {

    /**
     * Rule name: Cancellation Compensation Cap
     */
    public static org.drools.model.Rule rule_Cancellation_32Compensation_32Cap() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Cancellation Compensation Cap")
                                      .build(D.pattern(var_$issue).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                        org.acme.P47.LambdaPredicate4770323DA6890ED96A6BAB3E33D04546.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.PAC.LambdaExtractorACF91512BC9F49315DC6413E35A5F050.INSTANCE,
                                                                                         "cancellation"),
                                                                        D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.P49.LambdaConsequence493DDAD4C234CF018C4037460DEE2F08.INSTANCE));
        return rule;
    }
}
