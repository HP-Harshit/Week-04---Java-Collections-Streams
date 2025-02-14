package banktransactionsystem;

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    private double amount;

    // Constructor to initialize exception message and shortfall amount
    public InsufficientBalanceException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    // Getter method to retrieve the shortfall amount
    public double getAmount() {
        return amount;
    }
}
