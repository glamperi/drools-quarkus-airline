package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;
import static org.acme.Rulesca50d071e601484ba72f9651b55e5575.*;

public class Rulesca50d071e601484ba72f9651b55e5575_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadataca50d071e601484ba72f9651b55e5575.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$issue).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                        org.acme.P29.LambdaPredicate296ADA1D6210C9C6BD73348220A32199.INSTANCE,
                                                                        D.reactOn("approved")),
                                             D.on(var_approvedRefunds).execute(org.acme.PFD.LambdaConsequenceFD6ED9D2810122B3CC673FC8244504CB.INSTANCE));
        return rule;
    }
}
