package banktransactionsystem;

public class BankAccount {

    // Private field to store the account balance
    private double balance;

    // Constructor to initialize the account with an initial balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit a positive amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /* Method to withdraw an amount from the account
       Throws InsufficientBalanceException if balance is insufficient
       Throws IllegalArgumentException if the amount is negative */
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount: Amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!", amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: $" + balance);
    }

    // Getter method to retrieve the account balance
    public double getBalance() {
        return balance;
    }
}
