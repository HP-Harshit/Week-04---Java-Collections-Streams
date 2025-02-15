package problemsofjunit.advancejunitpracticeproblems.testingbankingtransactions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount();
    }

    @Test
    void testDeposit() {
        // Initial balance should be 0
        assertEquals(0, account.getBalance());

        // Deposit an amount and verify the balance
        account.deposit(100);
        assertEquals(100, account.getBalance());

        // Deposit another amount and verify the balance
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        // Deposit an amount to enable withdrawal
        account.deposit(100);

        // Withdraw an amount and verify the balance
        assertTrue(account.withdraw(50));
        assertEquals(50, account.getBalance());

        // Attempt to withdraw more than the balance
        assertFalse(account.withdraw(60));
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        // Attempt to withdraw without sufficient funds
        assertFalse(account.withdraw(50));
        assertEquals(0, account.getBalance());
    }

    @Test
    void testGetBalance() {
        // Verify initial balance is 0
        assertEquals(0, account.getBalance());

        // Deposit an amount and verify the balance
        account.deposit(200);
        assertEquals(200, account.getBalance());
    }
}
