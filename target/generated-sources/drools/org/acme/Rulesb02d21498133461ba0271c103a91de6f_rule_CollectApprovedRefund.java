package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;
import static org.acme.Rulesb02d21498133461ba0271c103a91de6f.*;

public class Rulesb02d21498133461ba0271c103a91de6f_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatab02d21498133461ba0271c103a91de6f.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$issue).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                        org.acme.PD4.LambdaPredicateD4894D4A076DB1DA44AE83D290B40DE7.INSTANCE,
                                                                        D.reactOn("approved")),
                                             D.on(var_$issue,
                                                  var_approvedRefunds).execute(org.acme.P32.LambdaConsequence32463B12AD8B31D3378213DF62919C3A.INSTANCE));
        return rule;
    }
}
