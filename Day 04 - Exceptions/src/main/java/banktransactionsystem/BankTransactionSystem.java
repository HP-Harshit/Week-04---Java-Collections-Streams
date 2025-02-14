package banktransactionsystem;

public class BankTransactionSystem {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance of $100
        BankAccount account = new BankAccount(100.0);

        try {
            // Deposit $50 into the account
            System.out.println("Depositing $50...");
            account.deposit(50.0);
            System.out.println("New balance: $" + account.getBalance());

            // Attempt to withdraw $200 from the account
            System.out.println("Withdrawing $200...");
            account.withdraw(200.0);

        } catch (InsufficientBalanceException e) {
            // Handle insufficient balance exception
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Shortfall: $" + e.getAmount());
        } catch (IllegalArgumentException e) {
            // Handle invalid amount exception
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Attempt to withdraw a negative amount
            System.out.println("Withdrawing $-50...");
            account.withdraw(-50.0);

        } catch (InsufficientBalanceException e) {
            // Handle insufficient balance exception
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Shortfall: $" + e.getAmount());
        } catch (IllegalArgumentException e) {
            // Handle invalid amount exception
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
