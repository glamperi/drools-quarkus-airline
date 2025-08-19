package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;
import static org.acme.Rulese2d4be1a899d433bb20806cb49c9cbc2.*;

public class Rulese2d4be1a899d433bb20806cb49c9cbc2_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae2d4be1a899d433bb20806cb49c9cbc2.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$issue).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                        org.acme.P5A.LambdaPredicate5A383C3BF7C6F62AE409154527054FF1.INSTANCE,
                                                                        D.reactOn("approved")),
                                             D.on(var_$issue,
                                                  var_approvedRefunds).execute(org.acme.P41.LambdaConsequence41137683B88B32C2E0FA3CE12151E265.INSTANCE));
        return rule;
    }
}
