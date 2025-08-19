package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;
import static org.acme.Rules2d134ade66064d0691a0d529e2889651.*;

public class Rules2d134ade66064d0691a0d529e2889651_rule_Annual_32Compensation_32Limit {

    /**
     * Rule name: Annual Compensation Limit
     */
    public static org.drools.model.Rule rule_Annual_32Compensation_32Limit() {
        final org.drools.model.Variable<org.acme.FlightIssue> var_$1 = D.declarationOf(org.acme.FlightIssue.class,
                                                                                       DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                       "$1");
        final org.drools.model.BitMask mask_$1 = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE,
                                                                                         "approved",
                                                                                         "customerCompensation");
        org.drools.model.Rule rule = D.rule("org.acme",
                                            "Annual Compensation Limit")
                                      .build(D.pattern(var_$1).expr("GENERATED_B96A8F1D6D21A28F05641A2D8EFF2BC3",
                                                                    org.acme.P4F.LambdaPredicate4FDEBD04F0C6B9D2226AF27D70363837.INSTANCE,
                                                                    D.alphaIndexedBy(double.class,
                                                                                     org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                     DomainClassesMetadata2d134ade66064d0691a0d529e2889651.org_acme_FlightIssue_Metadata_INSTANCE.getPropertyIndex("customerCompensation"),
                                                                                     org.acme.P15.LambdaExtractor15B5D265C048162373A8D6D77B2E03A2.INSTANCE,
                                                                                     500.0),
                                                                    D.reactOn("customerCompensation")),
                                             D.on(var_$1).execute(org.acme.P1C.LambdaConsequence1C9B53AB8A4853F3D1C3C0A23572BE73.INSTANCE));
        return rule;
    }
}
