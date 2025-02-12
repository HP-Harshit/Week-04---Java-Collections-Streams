package mapinterface.designavotingsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class VotingSystemTest {

    // Test method to verify the addVote and getVotesForCandidate methods
    @Test
    void testAddVoteAndGetVotesForCandidate() {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes for candidates
        votingSystem.addVote("Alice");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");

        // Verify the vote count for each candidate
        Assertions.assertEquals(2, votingSystem.getVotesForCandidate("Alice"));
        Assertions.assertEquals(1, votingSystem.getVotesForCandidate("Bob"));
        Assertions.assertEquals(0, votingSystem.getVotesForCandidate("Carol"));
    }

    // Test method to verify the getOrderVotes method
    @Test
    void testGetOrderVotes() {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes for candidates
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Carol");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Bob");

        // Define the expected order of votes
        Map<String, Integer> expectedOrderVotes = new LinkedHashMap<>();
        expectedOrderVotes.put("Alice", 2);
        expectedOrderVotes.put("Bob", 3);
        expectedOrderVotes.put("Carol", 1);

        // Verify the order of votes
        Assertions.assertEquals(expectedOrderVotes, votingSystem.getOrderVotes());
    }

    // Test method to verify the getSortedVotes method
    @Test
    void testGetSortedVotes() {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes for candidates
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Carol");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Bob");

        // Define the expected sorted votes
        Map<String, Integer> expectedSortedVotes = new TreeMap<>();
        expectedSortedVotes.put("Alice", 2);
        expectedSortedVotes.put("Bob", 3);
        expectedSortedVotes.put("Carol", 1);

        // Verify the sorted votes
        Assertions.assertEquals(expectedSortedVotes, votingSystem.getSortedVotes());
    }

    // Test method to verify the displayResults method
    @Test
    void testDisplayResults() {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes for candidates
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Carol");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Bob");

        // This test checks the outputs for order and sorted votes by printing the results
        System.out.println("Testing displayResults method:");
        votingSystem.displayResults();
    }
}