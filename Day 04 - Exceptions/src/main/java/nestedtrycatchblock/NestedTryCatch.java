package nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        try {
            // Outer try block to handle general exceptions
            int[] numbers = new int[5];

            // Fill the array with input values
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter number " + (i + 1) + ":");
                numbers[i] = input.nextInt();
            }

            System.out.println("Enter the divisor:");
            int divisor = input.nextInt();

            try {
                // Inner try block 1 to handle division
                int result = numbers[1] / divisor; // This may throw ArithmeticException
                System.out.println("Division result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

            try {
                // Inner try block 2 to access an array element
                System.out.println("Enter the index to access:");
                int index = input.nextInt();
                System.out.println("Element at index " + index + ": " + numbers[index]); // This may throw ArrayIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (Exception e) {
            System.out.println("General Exception caught in outer try block: " + e.getMessage());
        } finally {
            // Close the Scanner object to release resources
            input.close();
        }
    }
}
