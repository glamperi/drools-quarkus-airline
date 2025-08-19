package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;
import static org.acme.Rulesfd7f43b36ebf405393c2a14f77a6aad4.*;

public class Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Cancellation_32Compensation_32Cap {

    /**
     * Rule name: Cancellation Compensation Cap
     */
    public static org.drools.model.Rule rule_Cancellation_32Compensation_32Cap() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Cancellation Compensation Cap")
                                      .build(D.pattern(var_$issue).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                        org.acme.P6A.LambdaPredicate6AF8B74EE6DC708A48CC7B15BC970212.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadatafd7f43b36ebf405393c2a14f77a6aad4.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                         org.acme.P6A.LambdaExtractor6ADB8FB82F2F3A9404EE6E24F0049E41.INSTANCE,
                                                                                         "cancellation"),
                                                                        D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.PE4.LambdaConsequenceE4B61B8C6FBB7EFCDF956A89A637ABA5.INSTANCE));
        return rule;
    }
}
