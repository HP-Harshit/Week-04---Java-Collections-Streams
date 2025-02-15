package problemsofjunit.basicjunitpracticeproblems.testingacalculatorclass;

public class Calculator {
    public static void main(String[] args) {
        try {
            // Test the add method with sample inputs
            System.out.println("Addition: " + add(4, 7));

            // Test the subtract method with sample inputs
            System.out.println("Subtraction: " + subtract(4, 1));

            // Test the multiply method with sample inputs
            System.out.println("Multiplication: " + multiply(3, 7));

            // Test the divide method with sample inputs
            System.out.println("Division: " + divide(4, 2));

            // Test the divide method with zero to handle exception
            System.out.println("Division with Zero: " + divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
        }
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract one integer from another
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide one integer by another
    // Throws IllegalArgumentException if dividing by zero
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
