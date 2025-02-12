package mapinterface.implementabankingsystem;

import java.util.*;

public class BankingSystem {
    // HashMap to store customer accounts (AccountNumber -> Balance)
    private Map<String, Double> accounts = new HashMap<>();

    // TreeMap to sort customers by balance
    private TreeMap<Double, String> sortedAccounts = new TreeMap<>();

    // Queue to process withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Method to add an account
    public void addAccount(String accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        sortedAccounts.put(initialBalance, accountNumber);
    }

    // Method to get the balance of an account
    public double getBalance(String accountNumber) {
        return accounts.getOrDefault(accountNumber, 0.0);
    }

    // Method to process a withdrawal request
    public void processWithdrawal(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            double newBalance = accounts.get(accountNumber) - amount;
            sortedAccounts.remove(accounts.get(accountNumber));
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
            System.out.println("Withdrawal processed for account " + accountNumber + ": $" + amount);
        } else {
            System.out.println("Withdrawal request denied for account " + accountNumber + ": Insufficient funds");
        }
    }

    // Method to add a withdrawal request to the queue
    public void addWithdrawalRequest(String accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    // Method to process all withdrawal requests in the queue
    public void processAllWithdrawalRequests() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            processWithdrawal(request.getAccountNumber(), request.getAmount());
        }
    }

    // Method to display accounts sorted by balance
    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("Account " + entry.getValue() + ": $" + entry.getKey());
        }
    }
}
