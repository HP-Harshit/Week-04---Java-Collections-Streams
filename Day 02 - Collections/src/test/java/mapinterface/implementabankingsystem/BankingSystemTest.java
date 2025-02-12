package mapinterface.implementabankingsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankingSystemTest {

    // Test method to verify adding an account and getting the balance
    @Test
    void testAddAccountAndGetBalance() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addAccount("A123", 5000.0);

        // Assert that the balance is correct
        Assertions.assertEquals(5000.0, bankingSystem.getBalance("A123"));
    }

    // Test method to verify processing a single withdrawal request
    @Test
    void testProcessWithdrawal() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addAccount("A123", 5000.0);

        // Process withdrawal and assert the balance
        bankingSystem.processWithdrawal("A123", 1000.0);
        Assertions.assertEquals(4000.0, bankingSystem.getBalance("A123"));
    }

    // Test method to verify adding a withdrawal request to the queue and processing it
    @Test
    void testAddAndProcessWithdrawalRequest() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addAccount("A123", 5000.0);

        // Add withdrawal request to the queue
        bankingSystem.addWithdrawalRequest("A123", 1000.0);

        // Process all withdrawal requests
        bankingSystem.processAllWithdrawalRequests();

        // Assert that the balance is correct after processing withdrawal
        Assertions.assertEquals(4000.0, bankingSystem.getBalance("A123"));
    }

    // Test method to verify displaying accounts sorted by balance
    @Test
    void testDisplaySortedAccounts() {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.addAccount("A123", 5000.0);
        bankingSystem.addAccount("B456", 3000.0);

        // Display sorted accounts after processing withdrawals
        bankingSystem.displaySortedAccounts();
    }
}
