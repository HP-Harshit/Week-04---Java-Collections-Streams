package setinterface.insurancepolicymanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create PolicyManager instance
        PolicyManager policyManager = new PolicyManager();

        // Create some policies
        List<Policy> policies = new ArrayList<>();
        policies.add(new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000));
        policies.add(new Policy("P002", "Bob", new Date(2025, 3, 30), "Auto", 3000));
        policies.add(new Policy("P003", "Carol", new Date(2025, 3, 15), "Home", 2000));

        // Add policies to the PolicyManager
        for (Policy policy : policies) {
            policyManager.addPolicy(policy);
        }

        // Demonstrate retrieval methods
        System.out.println("All unique policies: " + policyManager.getAllUniquePolicies());
        System.out.println("Policies expiring soon: " + policyManager.getPoliciesExpiringSoon());
        System.out.println("Policies with coverage type 'Health': " + policyManager.getPoliciesByCoverageType("Health"));
        System.out.println("Duplicate policies: " + policyManager.getDuplicatePolicies());
        System.out.println();

        Policy policy = new Policy("P004", "Jack", new Date(2025, 3, 15), "Home", 2000);

        // Perform and compare performance of adding policies
        policyManager.compareAddPerformance(policy);
        System.out.println();

        // Perform and compare performance of searching for policies
        policyManager.compareSearchPerformance(policy);
        System.out.println();

        // Perform and compare performance of removing policies
        policyManager.compareRemovePerformance(policy);
    }
}
