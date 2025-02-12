package mapinterface.insurancepolicymanagementsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class PolicyManagerTest {

    // Test for adding and retrieving a policy
    @Test
    void testAddAndRetrievePolicy() {
        PolicyManager policyManager = new PolicyManager();
        // Create a new policy
        Policy policy = new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000);

        // Add the policy to the manager
        policyManager.addPolicy(policy);
        // Retrieve the policy by its number
        Policy retrievedPolicy = policyManager.getPolicyByNumber("P001");

        // Assert that the retrieved policy matches the added policy
        Assertions.assertEquals(policy, retrievedPolicy);
    }

    // Test for retrieving policies expiring soon (within the next 30 days)
    @Test
    void testGetPoliciesExpiringSoon() {
        PolicyManager policyManager = new PolicyManager();
        // Create policies with different expiry dates
        Policy policy1 = new Policy("P001", "Alice", new Date(new Date().getTime() + (10L * 24 * 60 * 60 * 1000)), "Health", 5000); // Expires in 10 days
        Policy policy2 = new Policy("P002", "Bob", new Date(new Date().getTime() + (40L * 24 * 60 * 60 * 1000)), "Auto", 3000); // Expires in 40 days

        // Add the policies to the manager
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        // Retrieve policies expiring soon
        List<Policy> expiringSoon = policyManager.getPoliciesExpiringSoon();

        // Assert that only the policy expiring within 30 days is retrieved
        Assertions.assertEquals(1, expiringSoon.size());
        Assertions.assertTrue(expiringSoon.contains(policy1));
    }

    // Test for retrieving policies by policyholder name
    @Test
    void testGetPoliciesByPolicyholder() {
        PolicyManager policyManager = new PolicyManager();
        // Create policies for different policyholders
        Policy policy1 = new Policy("P001", "Alice", new Date(2025, 4, 5), "Health", 5000);
        Policy policy2 = new Policy("P002", "Alice", new Date(2025, 3, 30), "Auto", 3000);
        Policy policy3 = new Policy("P003", "Bob", new Date(2025, 3, 15), "Home", 2000);

        // Add the policies to the manager
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        policyManager.addPolicy(policy3);

        // Retrieve policies for a specific policyholder
        List<Policy> policiesForAlice = policyManager.getPoliciesByPolicyholder("Alice");

        // Assert that the retrieved policies match those of the policyholder
        Assertions.assertEquals(2, policiesForAlice.size());
        Assertions.assertTrue(policiesForAlice.contains(policy1));
        Assertions.assertTrue(policiesForAlice.contains(policy2));
    }

    // Test for removing expired policies
    @Test
    void testRemoveExpiredPolicies() {
        PolicyManager policyManager = new PolicyManager();
        // Create policies with different expiry dates
        Policy policy1 = new Policy("P001", "Alice", new Date(new Date().getTime() - (10L * 24 * 60 * 60 * 1000)), "Health", 5000); // Expired 10 days ago
        Policy policy2 = new Policy("P002", "Bob", new Date(new Date().getTime() + (40L * 24 * 60 * 60 * 1000)), "Auto", 3000); // Expires in 40 days

        // Add the policies to the manager
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        // Retrieve policies for all unique policies
        policyManager.removeExpiredPolicies();
        Collection<Policy> remainingPolicies = policyManager.getAllUniquePolicies();

        // Assert that the retrieved policies match those of the policyholder
        Assertions.assertEquals(1, remainingPolicies.size());
        Assertions.assertTrue(remainingPolicies.contains(policy2));
    }
}