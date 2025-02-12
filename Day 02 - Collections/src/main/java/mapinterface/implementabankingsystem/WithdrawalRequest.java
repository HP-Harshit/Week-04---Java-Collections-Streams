package mapinterface.implementabankingsystem;

public class WithdrawalRequest {
    private String accountNumber; // Account number
    private double amount; // Withdrawal amount

    // Constructor to initialize a withdrawal request with account number and amount
    public WithdrawalRequest(String accountNumber, double amount) {
        this.accountNumber = accountNumber; // Initialize account number
        this.amount = amount; // Initialize amount
    }

    // Method to get the account number
    public String getAccountNumber() {
        return accountNumber; // Return account number
    }

    // Method to get the withdrawal amount
    public double getAmount() {
        return amount; // Return amount
    }
}
