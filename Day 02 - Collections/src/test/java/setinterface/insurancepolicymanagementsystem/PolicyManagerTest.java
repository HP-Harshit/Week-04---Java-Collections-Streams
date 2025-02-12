package setinterface.insurancepolicymanagementsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class PolicyManagerTest {

    @Test
    void testAddPolicy() {
        PolicyManager policyManager = new PolicyManager();
        Policy policy = new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000);

        policyManager.addPolicy(policy);

        Set<Policy> uniquePolicies = policyManager.getAllUniquePolicies();
        Assertions.assertTrue(uniquePolicies.contains(policy));
    }

    @Test
    void testGetAllUniquePolicies() {
        PolicyManager policyManager = new PolicyManager();
        Policy policy1 = new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000);
        Policy policy2 = new Policy("P002", "Bob", new Date(2025, 3, 30), "Auto", 3000);

        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        Set<Policy> uniquePolicies = policyManager.getAllUniquePolicies();
        Assertions.assertEquals(2, uniquePolicies.size());
    }

    @Test
    void testGetPoliciesExpiringSoon() {
        PolicyManager policyManager = new PolicyManager();
        Policy policy1 = new Policy("P001", "Alice", new Date(new Date().getTime() + (15L * 24 * 60 * 60 * 1000)), "Health", 5000);
        Policy policy2 = new Policy("P002", "Bob", new Date(new Date().getTime() + (45L * 24 * 60 * 60 * 1000)), "Auto", 3000);

        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        List<Policy> expiringSoon = policyManager.getPoliciesExpiringSoon();
        Assertions.assertEquals(1, expiringSoon.size());
        Assertions.assertTrue(expiringSoon.contains(policy1));
    }

    @Test
    void testGetPoliciesByCoverageType() {
        PolicyManager policyManager = new PolicyManager();
        Policy policy1 = new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000);
        Policy policy2 = new Policy("P002", "Bob", new Date(2025, 3, 30), "Auto", 3000);
        Policy policy3 = new Policy("P003", "Carol", new Date(2025, 3, 15), "Health", 2000);

        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        List<Policy> healthPolicies = policyManager.getPoliciesByCoverageType("Health");
        Assertions.assertEquals(2, healthPolicies.size());
        Assertions.assertTrue(healthPolicies.contains(policy1));
        Assertions.assertTrue(healthPolicies.contains(policy3));
    }

    @Test
    void testGetDuplicatePolicies() {
        PolicyManager policyManager = new PolicyManager();
        Policy policy1 = new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000);
        Policy policy2 = new Policy("P001", "Bob", new Date(2025, 3, 30), "Auto", 3000); // Duplicate policy number

        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        Set<Policy> duplicates = policyManager.getDuplicatePolicies();
        Assertions.assertEquals(1, duplicates.size());
        Assertions.assertTrue(duplicates.contains(policy2));
    }

    @Test
    void testPerformanceComparison() {
        PolicyManager policyManager = new PolicyManager();

        // Create a list of 1000 policies
        List<Policy> policies = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            policies.add(new Policy("P" + i, "Policyholder" + i, new Date(2025, 4, 5), "Health", 5000));
        }

        Policy policy = new Policy("P004", "Jack", new Date(2025, 3, 15), "Home", 2000);

        // Add policies to the PolicyManager and measure performance
        policyManager.compareAddPerformance(policy);

        // Search for policies in the PolicyManager and measure performance
        policyManager.compareSearchPerformance(policy);

        // Remove policies from the PolicyManager and measure performance
        policyManager.compareRemovePerformance(policy);

        // Assertions can be added if needed to validate functionality
    }
}