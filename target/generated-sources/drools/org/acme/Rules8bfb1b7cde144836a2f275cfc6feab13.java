package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;

public class Rules8bfb1b7cde144836a2f275cfc6feab13 implements org.drools.model.Model {

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

    public static final org.drools.model.Global<java.lang.Integer> var_maxRefundAllowed = D.globalOf(java.lang.Integer.class,
                                                                                                     "org.acme",
                                                                                                     "maxRefundAllowed");

    public static final org.drools.model.Global<java.util.List> var_approvedRefunds = D.globalOf(java.util.List.class,
                                                                                                 "org.acme",
                                                                                                 "approvedRefunds");

    protected java.util.List<org.drools.model.Global> globals = new java.util.ArrayList<>();

    java.util.List<org.drools.model.TypeMetaData> typeMetaDatas = java.util.Collections.emptyList();

    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Delay_32Compensation_32for_32Basic_32Loyalty.rule_Delay_32Compensation_32for_32Basic_32Loyalty(),
                                       Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Delay_32Compensation_32for_32Silver_32Loyalty.rule_Delay_32Compensation_32for_32Silver_32Loyalty(),
                                       Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Delay_32Compensation_32for_32Gold_32Loyalty.rule_Delay_32Compensation_32for_32Gold_32Loyalty(),
                                       Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Cancellation_32Compensation_32Cap.rule_Cancellation_32Compensation_32Cap(),
                                       Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Voucher_32for_32Minor_32Issues.rule_Voucher_32for_32Minor_32Issues(),
                                       Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers.rule_Loyalty_32Benefits_32for_32Frequent_32Flyers(),
                                       Rules8bfb1b7cde144836a2f275cfc6feab13_rule_Annual_32Compensation_32Limit.rule_Annual_32Compensation_32Limit(),
                                       Rules8bfb1b7cde144836a2f275cfc6feab13_rule_CollectApprovedRefund.rule_CollectApprovedRefund());
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

    {
        globals.add(var_maxRefundAllowed);
        globals.add(var_approvedRefunds);
    }
}
