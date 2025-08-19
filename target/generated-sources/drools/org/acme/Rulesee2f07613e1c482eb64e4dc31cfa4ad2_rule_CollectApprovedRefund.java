package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;
import static org.acme.Rulesee2f07613e1c482eb64e4dc31cfa4ad2.*;

public class Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadataee2f07613e1c482eb64e4dc31cfa4ad2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$1).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                    org.acme.P5B.LambdaPredicate5B2796488B28D7DD4A28F7A17D4C2368.INSTANCE,
                                                                    D.reactOn("approved")),
                                             D.on(var_approvedRefunds,
                                                  var_$1).execute(org.acme.P8C.LambdaConsequence8C686CBABEE26E5299F944918EAB6008.INSTANCE));
        return rule;
    }
}
