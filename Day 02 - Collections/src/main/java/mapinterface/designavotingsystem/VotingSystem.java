package mapinterface.designavotingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystem {
    // HashMap to store votes (Candidate -> Votes)
    private Map<String, Integer> votesMap = new HashMap<>();

    // LinkedHashMap to maintain the order of votes
    private Map<String, Integer> orderVotesMap = new LinkedHashMap<>();

    // TreeMap to display the results in sorted order
    private Map<String, Integer> sortedVotesMap = new TreeMap<>();

    // Method to cast a vote for a candidate
    public void addVote(String candidate) {
        // Increment the vote count in votesMap
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);

        // Increment the vote count in orderVotesMap
        orderVotesMap.put(candidate, orderVotesMap.getOrDefault(candidate, 0) + 1);

        // Increment the vote count in sortedVotesMap
        sortedVotesMap.put(candidate, sortedVotesMap.getOrDefault(candidate, 0) + 1);
    }

    // Method to get the total votes for a candidate
    public int getVotesForCandidate(String candidate) {
        return votesMap.getOrDefault(candidate, 0);
    }

    // Method to get the votes in the order they were cast
    public Map<String, Integer> getOrderVotes() {
        return new LinkedHashMap<>(orderVotesMap);
    }

    // Method to get the sorted votes
    public Map<String, Integer> getSortedVotes() {
        return new TreeMap<>(sortedVotesMap);
    }

    // Method to display the results
    public void displayResults() {
        System.out.println("Votes (in order of casting): " + orderVotesMap);
        System.out.println("Votes (sorted): " + sortedVotesMap);
    }
}
