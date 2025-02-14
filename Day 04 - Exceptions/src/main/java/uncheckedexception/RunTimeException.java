package uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTimeException {
    public static void main(String[] args) {
        // Perform division operation
        divide();
    }

    // Method to perform division of two numbers
    public static boolean divide(){
        // Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        try {
            // Prompt user to enter the first number
            System.out.println("Enter the first number: ");
            int a = input.nextInt();

            // Prompt user to enter the second number
            System.out.println("Enter the second number: ");
            int b = input.nextInt();

            // Perform division operation
            int res = a / b;

            // Print the result of the division
            System.out.println("Result: " + res);

            // Close the Scanner object
            input.close();

            return true;

        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Number can't be divided by 0, please enter valid number. " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle non-numeric input exception
            System.out.println("InputMismatchException caught! Please enter valid number. " + e.getMessage());
        }

        return false;
    }
}
