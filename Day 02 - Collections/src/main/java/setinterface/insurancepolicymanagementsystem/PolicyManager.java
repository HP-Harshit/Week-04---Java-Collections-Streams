package setinterface.insurancepolicymanagementsystem;

import java.util.*;

public class PolicyManager {
    // Sets to store policies using different types of sets
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

    // Method to add a policy
    public void addPolicy(Policy policy) {
        // Add the policy to the HashSet for quick lookups
        hashSet.add(policy);

        // Add the policy to the LinkedHashSet to maintain insertion order
        linkedHashSet.add(policy);

        // Add the policy to the TreeSet to maintain sorted order by expiry date
        treeSet.add(policy);
    }

    // Method to retrieve all unique policies
    public Set<Policy> getAllUniquePolicies() {
        // Return the set of all unique policies stored in the HashSet
        return hashSet;
    }

    // Method to retrieve policies expiring soon (within the next 30 days)
    public List<Policy> getPoliciesExpiringSoon() {
        // List to store policies expiring soon
        List<Policy> expiringSoon = new ArrayList<>();

        // Current date
        Date now = new Date();

        // Date 30 days from now
        Date soon = new Date(now.getTime() + (30L * 24 * 60 * 60 * 1000)); // 30 days from now

        // Iterate through the TreeSet to find policies expiring within the next 30 days
        for (Policy policy : treeSet) {
            if (policy.getExpiryDate().before(soon)) {
                expiringSoon.add(policy);
            }
        }

        // Return the list of policies expiring soon
        return expiringSoon;
    }

    // Method to retrieve policies with a specific coverage type
    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        // List to store policies with the specified coverage type
        List<Policy> policiesByType = new ArrayList<>();

        // Iterate through the HashSet to find policies with the specified coverage type
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policiesByType.add(policy);
            }
        }

        // Return the list of policies with the specified coverage type
        return policiesByType;
    }

    // Method to retrieve duplicate policies based on policy numbers
    public Set<Policy> getDuplicatePolicies() {
        // Set to store duplicate policies
        Set<Policy> duplicates = new HashSet<>();

        // TreeSet to track unique policy numbers
        Set<String> uniquePolicyNumbers = new HashSet<>();

        // Iterate through the LinkedHashSet to find duplicate policies
        for (Policy policy : treeSet) {
            if (uniquePolicyNumbers.contains(policy.getPolicyNumber())) {
                // Add the policy to duplicates if the policy number is already in the set
                duplicates.add(policy);
            } else {
                uniquePolicyNumbers.add(policy.getPolicyNumber());
            }
        }

        // Return the set of duplicate policies
        return duplicates;
    }





    // Method to compare performance of adding policies
    public void compareAddPerformance(Policy policy) {
        long startTime, endTime;

        // Measure time taken to add to HashSet
        startTime = System.nanoTime();
        hashSet.add(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to HashSet: " + (endTime - startTime) + " ns");

        // Measure time taken to add to LinkedHashSet
        startTime = System.nanoTime();
        linkedHashSet.add(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to LinkedHashSet: " + (endTime - startTime) + " ns");

        // Measure time taken to add to TreeSet
        startTime = System.nanoTime();
        treeSet.add(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to TreeSet: " + (endTime - startTime) + " ns");
    }

    // Method to compare performance of removing policies
    public void compareRemovePerformance(Policy policy) {
        long startTime, endTime;

        // Measure time taken to remove from HashSet
        startTime = System.nanoTime();
        hashSet.remove(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from HashSet: " + (endTime - startTime) + " ns");

        // Measure time taken to remove from LinkedHashSet
        startTime = System.nanoTime();
        linkedHashSet.remove(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from LinkedHashSet: " + (endTime - startTime) + " ns");

        // Measure time taken to remove from TreeSet
        startTime = System.nanoTime();
        treeSet.remove(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from TreeSet: " + (endTime - startTime) + " ns");
    }

    // Method to compare performance of searching for policies
    public void compareSearchPerformance(Policy policy) {
        long startTime, endTime;

        // Measure time taken to search in HashSet
        startTime = System.nanoTime();
        boolean foundInHashSet = hashSet.contains(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in HashSet: " + (endTime - startTime) + " ns" + " (Found: " + foundInHashSet + ")");

        // Measure time taken to search in LinkedHashSet
        startTime = System.nanoTime();
        boolean foundInLinkedHashSet = linkedHashSet.contains(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in LinkedHashSet: " + (endTime - startTime) + " ns" + " (Found: " + foundInLinkedHashSet + ")");

        // Measure time taken to search in TreeSet
        startTime = System.nanoTime();
        boolean foundInTreeSet = treeSet.contains(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in TreeSet: " + (endTime - startTime) + " ns" + " (Found: " + foundInTreeSet + ")");
    }
}
