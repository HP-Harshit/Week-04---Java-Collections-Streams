package mapinterface.insurancepolicymanagementsystem;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PolicyManager policyManager = new PolicyManager();

        // Create some policies
        Policy policy1 = new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000);
        Policy policy2 = new Policy("P002", "Bob", new Date(2025, 3, 30), "Auto", 3000);
        Policy policy3 = new Policy("P003", "Carol", new Date(2025, 3, 15), "Home", 2000);

        // Add policies to the PolicyManager
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        // Retrieve a policy by its number
        System.out.println("Policy with number P001: " + policyManager.getPolicyByNumber("P001"));

        // List all policies expiring within the next 30 days
        System.out.println("\nPolicies expiring soon: " + policyManager.getPoliciesExpiringSoon());

        // List all policies for a specific policyholder
        System.out.println("\nPolicies for policyholder Alice: " + policyManager.getPoliciesByPolicyholder("Alice"));

        // Remove expired policies
        policyManager.removeExpiredPolicies();
        System.out.println("\nPolicies after removing expired ones: " + policyManager.getAllUniquePolicies());
    }
}
