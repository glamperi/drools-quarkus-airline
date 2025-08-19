package org.acme;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.CompensationHelper;
import org.acme.FlightIssue;

public class Rulesee2f07613e1c482eb64e4dc31cfa4ad2 implements org.drools.model.Model {

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
        return java.util.Arrays.asList(Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Delay_32Compensation_32for_32Basic_32Loyalty.rule_Delay_32Compensation_32for_32Basic_32Loyalty(),
                                       Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Delay_32Compensation_32for_32Silver_32Loyalty.rule_Delay_32Compensation_32for_32Silver_32Loyalty(),
                                       Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Delay_32Compensation_32for_32Gold_32Loyalty.rule_Delay_32Compensation_32for_32Gold_32Loyalty(),
                                       Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Cancellation_32Compensation_32Cap.rule_Cancellation_32Compensation_32Cap(),
                                       Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Voucher_32for_32Minor_32Issues.rule_Voucher_32for_32Minor_32Issues(),
                                       Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Loyalty_32Benefits_32for_32Frequent_32Flyers.rule_Loyalty_32Benefits_32for_32Frequent_32Flyers(),
                                       Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_Annual_32Compensation_32Limit.rule_Annual_32Compensation_32Limit(),
                                       Rulesee2f07613e1c482eb64e4dc31cfa4ad2_rule_CollectApprovedRefund.rule_CollectApprovedRefund());
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
