package problemsofjunit.advancejunitpracticeproblems.testingbankingtransactions;

public class BankAccount {
    private double balance;

    // Main method to demonstrate banking transactions
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Demonstrate deposit
        account.deposit(200);
        System.out.println("Balance after deposit: $" + account.getBalance());

        // Demonstrate withdrawal with sufficient funds
        if (account.withdraw(50)) {
            System.out.println("Withdrawal successful. Remaining balance: $" + account.getBalance());
        } else {
            System.out.println("Withdrawal failed due to insufficient funds. Balance: $" + account.getBalance());
        }

        // Demonstrate withdrawal with insufficient funds
        if (account.withdraw(300)) {
            System.out.println("Withdrawal successful. Remaining balance: $" + account.getBalance());
        } else {
            System.out.println("Withdrawal failed due to insufficient funds. Balance: $" + account.getBalance());
        }
    }

    // Method to add money to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to reduce the balance
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Method to return the current balance
    public double getBalance() {
        return balance;
    }
}
