package banktransactionsystem;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankTransactionSystemTest {

    @Test
    public void testDeposit() {
        // Create a bank account with an initial balance of $100
        BankAccount account = new BankAccount(100.0);

        // Deposit $50 into the account
        account.deposit(50.0);

        // Verify the new balance is $150
        assertEquals(150.0, account.getBalance(), "Balance should be 150 after depositing $50.");
    }

    @Test
    public void testWithdraw_Valid() throws InsufficientBalanceException {
        // Create a bank account with an initial balance of $100
        BankAccount account = new BankAccount(100.0);

        // Withdraw $50 from the account
        account.withdraw(50.0);

        // Verify the new balance is $50
        assertEquals(50.0, account.getBalance(), "Balance should be 50 after withdrawing $50.");
    }

    @Test
    public void testWithdraw_InsufficientBalance() {
        // Create a bank account with an initial balance of $100
        BankAccount account = new BankAccount(100.0);

        // Verify that withdrawing $150 throws an InsufficientBalanceException
        assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(150.0);
        }, "InsufficientBalanceException should be thrown when withdrawing more than the balance.");
    }

    @Test
    public void testWithdraw_NegativeAmount() {
        // Create a bank account with an initial balance of $100
        BankAccount account = new BankAccount(100.0);

        // Verify that withdrawing a negative amount throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50.0);
        }, "IllegalArgumentException should be thrown when withdrawing a negative amount.");
    }
}
