package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;
import static org.acme.Rules0d704bd787224145a32b52ccd6e3f796.*;

public class Rules0d704bd787224145a32b52ccd6e3f796_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata0d704bd787224145a32b52ccd6e3f796.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$1).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                    org.acme.P44.LambdaPredicate445C53F42C56070125B605C6B56050D4.INSTANCE,
                                                                    D.reactOn("approved")),
                                             D.on(var_approvedRefunds,
                                                  var_$1).execute(org.acme.PFC.LambdaConsequenceFC1EC4091A0BE470A74AE2AD439FD3F7.INSTANCE));
        return rule;
    }
}
