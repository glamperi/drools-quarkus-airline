package org.acme;
public class DomainClassesMetadatae198757477be4c5c9f8282730ae3eaf2 {

    public static final org.drools.model.DomainClassMetadata org_acme_FlightIssue_Metadata_INSTANCE = new org_acme_FlightIssue_Metadata();
    private static class org_acme_FlightIssue_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.FlightIssue.class;
        }

        @Override
        public int getPropertiesSize() {
            return 6;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "this": return 0;
                case "customerCompensation": return 1;
                case "customerLoyaltyStatus": return 2;
                case "flightNumber": return 3;
                case "issueDuration": return 4;
                case "issueType": return 5;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.FlightIssue");
        }
    }
}