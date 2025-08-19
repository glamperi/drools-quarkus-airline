package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;

public class Rulesfd7f43b36ebf405393c2a14f77a6aad4 implements org.drools.model.Model {

    public final static java.time.format.DateTimeFormatter DATE_TIME_FORMATTER = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern(org.drools.util.DateUtils.getDateFormatMask()).toFormatter(java.util.Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.acme";
    }

    @Override
    public java.util.List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public java.util.List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    protected java.util.List<org.drools.model.Global> globals = java.util.Collections.emptyList();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Delay_32Compensation_32for_32Basic_32Loyalty.rule_Delay_32Compensation_32for_32Basic_32Loyalty(),
                                       Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Delay_32Compensation_32for_32Silver_32Loyalty.rule_Delay_32Compensation_32for_32Silver_32Loyalty(),
                                       Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Delay_32Compensation_32for_32Gold_32Loyalty.rule_Delay_32Compensation_32for_32Gold_32Loyalty(),
                                       Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Cancellation_32Compensation_32Cap.rule_Cancellation_32Compensation_32Cap(),
                                       Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Voucher_32for_32Minor_32Issues.rule_Voucher_32for_32Minor_32Issues(),
                                       Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers.rule_Loyalty_32Benefits_32for_32Frequent_32Flyers(),
                                       Rulesfd7f43b36ebf405393c2a14f77a6aad4_rule_Annual_32Compensation_32Limit.rule_Annual_32Compensation_32Limit());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Collections.emptyList();
    }
}
