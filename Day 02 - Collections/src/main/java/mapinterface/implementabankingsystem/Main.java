package mapinterface.implementabankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Add customer accounts
        bankingSystem.addAccount("A123", 5000.0);
        bankingSystem.addAccount("B456", 3000.0);
        bankingSystem.addAccount("C789", 7000.0);

        // Display sorted accounts
        bankingSystem.displaySortedAccounts();

        // Add withdrawal requests to the queue
        bankingSystem.addWithdrawalRequest("A123", 1000.0);
        bankingSystem.addWithdrawalRequest("B456", 4000.0); // Should be denied due to insufficient funds
        bankingSystem.addWithdrawalRequest("C789", 2000.0);

        // Process all withdrawal requests
        bankingSystem.processAllWithdrawalRequests();

        // Display sorted accounts after processing withdrawals
        bankingSystem.displaySortedAccounts();
    }
}
