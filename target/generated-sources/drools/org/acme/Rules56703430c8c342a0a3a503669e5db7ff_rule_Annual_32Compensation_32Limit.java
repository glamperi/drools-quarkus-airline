package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules56703430c8c342a0a3a503669e5db7ff.*;
import static org.acme.Rules56703430c8c342a0a3a503669e5db7ff.*;

public class Rules56703430c8c342a0a3a503669e5db7ff_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$issue = D.declarationOf(org.acme.FlightIssue.class,
                                                                                           DomainClassesMetadata56703430c8c342a0a3a503669e5db7ff.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                           "$issue");
        final org.drools.model.BitMask mask_$issue = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata56703430c8c342a0a3a503669e5db7ff.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                             "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$issue).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                        org.acme.PD6.LambdaPredicateD600D2D923DFFDEACA0B80C612AC231E.INSTANCE,
                                                                        D.alphaIndexedBy(double.class,
                                                                                         org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                         DomainClassesMetadata56703430c8c342a0a3a503669e5db7ff.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                         org.acme.PB3.LambdaExtractorB367D5F6F4036279C6729C59094C6AA9.INSTANCE,
                                                                                         500.0),
                                                                        D.reactOn("customerCompensation")),
                                             D.on(var_$issue).execute(org.acme.P11.LambdaConsequence117F254719B968A93412F0250D4A72B6.INSTANCE));
        return rule;
    }
}
