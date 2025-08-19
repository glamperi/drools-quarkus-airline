package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;
import static org.acme.Rules8bfb1b7cde144836a2f275cfc6feab13.*;

public class Rules8bfb1b7cde144836a2f275cfc6feab13_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata8bfb1b7cde144836a2f275cfc6feab13.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$1).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                    org.acme.P49.LambdaPredicate499D6F7FD48D291457FCA0426592469C.INSTANCE,
                                                                    D.reactOn("approved")),
                                             D.on(var_approvedRefunds,
                                                  var_$1).execute(org.acme.P82.LambdaConsequence827E01C4DFD95DC86AF6D87224AA4CFD.INSTANCE));
        return rule;
    }
}
