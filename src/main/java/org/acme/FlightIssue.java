package org.acme;

/**
 * A fact representing a flight-related issue that requires compensation.
 * The rules engine will use this class to evaluate and modify compensation.
 */
public class FlightIssue {

    private String flightNumber;
    private String issueType; // e.g., "delay", "cancellation", "lost luggage"
    private int issueDuration; // in hours or days
    private double customerCompensation;
    private String customerLoyaltyStatus; // e.g., "basic", "silver", "gold"
    private boolean approved = false;



    /**
     * Constructor to create a new FlightIssue instance.
     * @param flightNumber The flight number.
     * @param issueType The type of issue.
     * @param issueDuration The duration of the issue.
     * @param customerCompensation The initial compensation amount.
     * @param customerLoyaltyStatus The customer's loyalty status.
     */
    public FlightIssue(String flightNumber, String issueType, int issueDuration, double customerCompensation, String customerLoyaltyStatus) {
        this.flightNumber = flightNumber;
        this.issueType = issueType;
        this.issueDuration = issueDuration;
        this.customerCompensation = customerCompensation;
        this.customerLoyaltyStatus = customerLoyaltyStatus;
    }

    // Getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getIssueType() {
        return issueType;
    }

    public int getIssueDuration() {
        return issueDuration;
    }

    public double getCustomerCompensation() {
        return customerCompensation;
    }

    public String getCustomerLoyaltyStatus() {
        return customerLoyaltyStatus;
    }

    // Setters
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public void setIssueDuration(int issueDuration) {
        this.issueDuration = issueDuration;
    }

    public void setCustomerCompensation(double customerCompensation) {
        this.customerCompensation = customerCompensation;
    }

    public void setCustomerLoyaltyStatus(String customerLoyaltyStatus) {
        this.customerLoyaltyStatus = customerLoyaltyStatus;
    }

    public boolean isApproved() {
        return approved;
     }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

}

