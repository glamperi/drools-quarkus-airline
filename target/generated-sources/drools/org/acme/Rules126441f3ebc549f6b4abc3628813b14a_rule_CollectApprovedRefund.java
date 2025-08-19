package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules126441f3ebc549f6b4abc3628813b14a.*;
import static org.acme.Rules126441f3ebc549f6b4abc3628813b14a.*;

public class Rules126441f3ebc549f6b4abc3628813b14a_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata126441f3ebc549f6b4abc3628813b14a.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$issue).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                        org.acme.P56.LambdaPredicate56F70D229FD5628630A71E0E634ECD01.INSTANCE,
                                                                        D.reactOn("approved")),
                                             D.on(var_$issue,
                                                  var_approvedRefunds).execute(org.acme.P8C.LambdaConsequence8CCA9EC5FF787469B47A359A3AC9BA72.INSTANCE));
        return rule;
    }
}
