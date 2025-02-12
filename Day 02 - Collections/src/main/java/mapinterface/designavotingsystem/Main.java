package mapinterface.designavotingsystem;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Cast some votes for candidates
        votingSystem.addVote("Alice");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Alice");
        votingSystem.addVote("Carol");
        votingSystem.addVote("Bob");
        votingSystem.addVote("Bob");

        // Display total votes for each candidate
        System.out.println("\nTotal votes for Alice: " + votingSystem.getVotesForCandidate("Alice"));
        System.out.println("Total votes for Bob: " + votingSystem.getVotesForCandidate("Bob"));
        System.out.println("Total votes for Carol: " + votingSystem.getVotesForCandidate("Carol"));

        // Display votes in the order they were cast
        System.out.println("\nVotes in order of casting:");
        for (Map.Entry<String, Integer> entry : votingSystem.getOrderVotes().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Display sorted votes
        System.out.println("\nVotes in sorted order:");
        for (Map.Entry<String, Integer> entry : votingSystem.getSortedVotes().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Display results using the displayResults method
        System.out.println();
        votingSystem.displayResults();
    }
}
