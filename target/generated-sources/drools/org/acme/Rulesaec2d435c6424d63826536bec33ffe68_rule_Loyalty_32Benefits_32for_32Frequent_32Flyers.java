package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;

public class Rulesaec2d435c6424d63826536bec33ffe68_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers {

    /**
     * Rule name: Loyalty Benefits for Frequent Flyers
     */
    public static org.drools.model.Rule rule_Loyalty_32Benefits_32for_32Frequent_32Flyers() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "approved",
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Loyalty Benefits for Frequent Flyers")
                                      .build(D.pattern(var_$issue).expr("GENERATED_35A232F5007FA1218C03C8FF67CF5644",
                                                                        org.acme.P05.LambdaPredicate05A415255F6E718E552F8AF3DFD19EEB.INSTANCE,
                                                                        D.alphaIndexedBy(java.lang.String.class,
                                                                                         org.drools.model.Index.ConstraintType.EQUAL,
                                                                                         DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerLoyaltyStatus"),
                                                                                         org.acme.PA7.LambdaExtractorA7C9B429C0E83B63DBFCEC6FBDEBC72A.INSTANCE,
                                                                                         "gold"),
                                                                        D.reactOn("customerLoyaltyStatus")).expr("GENERATED_032A053B7B20EBCAF66C818B02435FB6",
                                                                                                                 org.acme.P47.LambdaPredicate4770323DA6890ED96A6BAB3E33D04546.INSTANCE,
                                                                                                                 D.alphaIndexedBy(java.lang.String.class,
                                                                                                                                  org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                  DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("issueType"),
                                                                                                                                  org.acme.PAC.LambdaExtractorACF91512BC9F49315DC6413E35A5F050.INSTANCE,
                                                                                                                                  "cancellation"),
                                                                                                                 D.reactOn("issueType")),
                                             D.on(var_$issue).execute(org.acme.PDC.LambdaConsequenceDC3051EE1D73C8F693A75A31F64D4A84.INSTANCE));
        return rule;
    }
}
