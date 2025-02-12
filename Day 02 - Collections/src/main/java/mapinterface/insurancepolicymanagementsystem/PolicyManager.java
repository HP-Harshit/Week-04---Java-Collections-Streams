package mapinterface.insurancepolicymanagementsystem;

import java.util.*;

public class PolicyManager {
    // Maps to store policies using different types of maps
    private Map<String, Policy> hashMap = new HashMap<>();
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private Map<Date, Policy> treeMap = new TreeMap<>();

    // Method to add a policy
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    // Method to retrieve a policy by its number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // Method to list all policies expiring within the next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringSoon = new ArrayList<>();
        Date now = new Date();
        Date soon = new Date(now.getTime() + (30L * 24 * 60 * 60 * 1000)); // 30 days from now

        for (Map.Entry<Date, Policy> entry : treeMap.entrySet()) {
            if (entry.getKey().before(soon)) {
                expiringSoon.add(entry.getValue());
            }
        }

        return expiringSoon;
    }

    // Method to list all policies for a specific policyholder
    public List<Policy> getPoliciesByPolicyholder(String policyholderName) {
        List<Policy> policies = new ArrayList<>();

        for (Policy policy : linkedHashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }

        return policies;
    }

    // Method to remove expired policies
    public void removeExpiredPolicies() {
        Date now = new Date();

        // Remove expired policies from HashMap and LinkedHashMap
        hashMap.values().removeIf(policy -> policy.getExpiryDate().before(now));
        linkedHashMap.values().removeIf(policy -> policy.getExpiryDate().before(now));

        // Remove expired policies from TreeMap
        treeMap.keySet().removeIf(expiryDate -> expiryDate.before(now));
    }

    // Method to get all unique policies
    public Collection<Policy> getAllUniquePolicies() {
        return linkedHashMap.values();
    }
}
