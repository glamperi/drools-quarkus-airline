package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;
import static org.acme.Rulesaec2d435c6424d63826536bec33ffe68.*;

public class Rulesaec2d435c6424d63826536bec33ffe68_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadataaec2d435c6424d63826536bec33ffe68.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$issue).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                        org.acme.P35.LambdaPredicate350272123D239DBA16C2E72E18C111CE.INSTANCE,
                                                                        D.reactOn("approved")),
                                             D.execute(org.acme.PF9.LambdaConsequenceF9A8B3036D53D2D9A3E4BEAB73696213.INSTANCE));
        return rule;
    }
}
