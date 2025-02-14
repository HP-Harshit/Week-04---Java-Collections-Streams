package throwvsthrows;

public class InterestCalculator {
    public static void main(String[] args) {
        try {
            // Call the calculateInterest method with valid inputs
            double interest = calculateInterest(1000, 5, 10);
            System.out.println("Calculated Interest: " + interest);

            // Call the calculateInterest method with invalid inputs
            double interest2 = calculateInterest(-1000, 5, 10);
            System.out.println("Calculated Interest: " + interest2);

        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.out.println("Invalid input: Amount and rate must be positive. " + e.getMessage());
        }
    }

    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Check if amount or rate is negative
        if (amount < 0 || rate < 0) {
            // Throw IllegalArgumentException if amount or rate is negative
            throw new IllegalArgumentException("Amount and rate must be positive.");
        }

        // Calculate and return the interest
        return (amount * rate * years) / 100;
    }
}
