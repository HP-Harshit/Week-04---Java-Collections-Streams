package finallyblockexecution;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        try {
            // Prompt user to enter the first integer
            System.out.println("Enter the first integer: ");
            int a = input.nextInt();

            // Prompt user to enter the second integer
            System.out.println("Enter the second integer: ");
            int b = input.nextInt();

            // Perform division
            int result = a / b;

            // Print the result of the division
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Error: Cannot divide by zero.");

        } finally {
            // Print the message to indicate operation completion
            System.out.println("Operation completed.");
            // Close the Scanner object to release resources
            input.close();
        }
    }
}
