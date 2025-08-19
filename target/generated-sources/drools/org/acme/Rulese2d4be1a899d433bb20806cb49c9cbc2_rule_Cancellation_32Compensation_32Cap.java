package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;

public class Rulese2d4be1a899d433bb20806cb49c9cbc2_rule_Cancellation_32Compensation_32Cap {

    /**
     * Rule name: Cancellation Compensation Cap
     */
    public static org.drools.model.Rule rule_Cancellation_32Compensation_32Cap() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Cancellation Compensation Cap")
                                      .build(D.pattern(var_$issue).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                        org.acme.PFE.LambdaPredicateFEF632BBE8F2131FD374DA9B8183B496.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.PD3.LambdaExtractorD310C0AA94E852B01C9858720552F2FD.INSTANCE,
                                                                                         "cancellation"),
                                                                        D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.PE7.LambdaConsequenceE76A5EB2E8867F1D567D4641BA97AD17.INSTANCE));
        return rule;
    }
}
