package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;

public class Rulese198757477be4c5c9f8282730ae3eaf2 implements org.drools.model.Model {

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
        return java.util.Arrays.asList(Rulese198757477be4c5c9f8282730ae3eaf2_rule_Delay_32Compensation_32for_32Basic_32Loyalty.rule_Delay_32Compensation_32for_32Basic_32Loyalty(),
                                       Rulese198757477be4c5c9f8282730ae3eaf2_rule_Delay_32Compensation_32for_32Silver_32Loyalty.rule_Delay_32Compensation_32for_32Silver_32Loyalty(),
                                       Rulese198757477be4c5c9f8282730ae3eaf2_rule_Delay_32Compensation_32for_32Gold_32Loyalty.rule_Delay_32Compensation_32for_32Gold_32Loyalty(),
                                       Rulese198757477be4c5c9f8282730ae3eaf2_rule_Cancellation_32Compensation_32Cap.rule_Cancellation_32Compensation_32Cap(),
                                       Rulese198757477be4c5c9f8282730ae3eaf2_rule_Voucher_32for_32Minor_32Issues.rule_Voucher_32for_32Minor_32Issues(),
                                       Rulese198757477be4c5c9f8282730ae3eaf2_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers.rule_Loyalty_32Benefits_32for_32Frequent_32Flyers(),
                                       Rulese198757477be4c5c9f8282730ae3eaf2_rule_Annual_32Compensation_32Limit.rule_Annual_32Compensation_32Limit());
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
