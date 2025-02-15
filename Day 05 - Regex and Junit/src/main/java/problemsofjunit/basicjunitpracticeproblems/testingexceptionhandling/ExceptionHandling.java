package problemsofjunit.basicjunitpracticeproblems.testingexceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Test the divide method with valid input
            int res1 = divide(14, 5);
            System.out.println("Divide result: " + res1);

            // Test the divide method with zero as the divisor to handle exception
            int res2 = divide(5, 0);
            System.out.println("Divide by zero: " + res2);
        } catch (ArithmeticException e) {
            // Catch and print the ArithmeticException
            System.out.println("ArithmeticException caught! " + e.getMessage());
        }
    }

    // Method to divide one integer by another
    // Throws ArithmeticException if dividing by zero
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}
