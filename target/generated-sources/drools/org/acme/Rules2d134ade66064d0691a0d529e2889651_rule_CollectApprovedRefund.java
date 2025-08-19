package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;

public class Rules2d134ade66064d0691a0d529e2889651_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$1).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                    org.acme.P82.LambdaPredicate82F12DFED5ABAA38ED60627D44361850.INSTANCE,
                                                                    D.reactOn("approved")),
                                             D.on(var_approvedRefunds,
                                                  var_$1).execute(org.acme.P58.LambdaConsequence58976EF19AE585D83C883A1AC7DFBBA4.INSTANCE));
        return rule;
    }
}
