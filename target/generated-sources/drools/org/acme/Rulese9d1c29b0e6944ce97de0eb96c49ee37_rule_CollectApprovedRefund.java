package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rulese9d1c29b0e6944ce97de0eb96c49ee37.*;
import static org.acme.Rulese9d1c29b0e6944ce97de0eb96c49ee37.*;

public class Rulese9d1c29b0e6944ce97de0eb96c49ee37_rule_CollectApprovedRefund {

    /**
     * Rule name: CollectApprovedRefund
     */
    public static org.drools.model.Rule rule_CollectApprovedRefund() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadatae9d1c29b0e6944ce97de0eb96c49ee37.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "CollectApprovedRefund")
                                      .build(D.pattern(var_$issue).expr("GENERATED_40ABCAD76A3C9134CCBE027078D8933E",
                                                                        org.acme.P44.LambdaPredicate445AB2295EF684DED27B8422E1E411E9.INSTANCE,
                                                                        D.reactOn("approved")),
                                             D.on(var_$issue,
                                                  var_approvedRefunds).execute(org.acme.P69.LambdaConsequence694AEE84759E820B0D35C556A0A1C6E8.INSTANCE));
        return rule;
    }
}
