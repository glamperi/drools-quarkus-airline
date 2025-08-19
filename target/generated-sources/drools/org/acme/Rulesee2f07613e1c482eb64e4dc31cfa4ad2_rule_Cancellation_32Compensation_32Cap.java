package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;

public class Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Cancellation_32Compensation_32Cap {

    /**
     * Rule name: Cancellation Compensation Cap
     */
    public static org.drools.model.Rule rule_Cancellation_32Compensation_32Cap() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Cancellation Compensation Cap")
                                      .build(D.pattern(var_$1).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                    org.acme.PA4.LambdaPredicateA406831D7E5E1264E5D22EFDF6299C5D.INSTANCE,
                                                                    D.alphaIndexedBy(java.lang.String.class,
                                                                                     org.drools.model.Index.ConstraintType.EQUAL,
                                                                                     DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                     org.acme.PB5.LambdaExtractorB534A3A765070435611FAFA9503AA9AD.INSTANCE,
                                                                                     "cancellation"),
                                                                    D.reactOn("issueType")),
                                             D.on(var_$1).execute(org.acme.P5C.LambdaConsequence5CD377B0EBA70A71DF604C3E34FF00BC.INSTANCE));
        return rule;
    }
}
