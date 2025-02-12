package setinterface.insurancepolicymanagementsystem;

import java.util.Date;
import java.util.Objects;

// Class to represent an insurance policy
public class Policy {
    // Private fields to store policy attributes
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Constructor to initialize all attributes of the policy
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getter method for policy number
    public String getPolicyNumber() {
        return policyNumber;
    }

    // Getter method for policyholder name
    public String getPolicyholderName() {
        return policyholderName;
    }

    // Getter method for expiry date
    public Date getExpiryDate() {
        return expiryDate;
    }

    // Getter method for coverage type
    public String getCoverageType() {
        return coverageType;
    }

    // Getter method for premium amount
    public double getPremiumAmount() {
        return premiumAmount;
    }

    // Override equals method to compare policies based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    // Override hashCode method to generate hash code based on policy number
    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    // Override toString method to provide string representation of the policy
    @Override
    public String toString() {
        return "\nPolicy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
