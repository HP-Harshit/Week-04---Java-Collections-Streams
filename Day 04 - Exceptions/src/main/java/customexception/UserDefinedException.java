package customexception;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        try {
            // Prompt user to enter age
            System.out.println("Enter your age: ");
            int age = input.nextInt();

            // Call validateAge method to check if age is valid
            validateAge(age);

        } catch (InvalidAgeException e) {
            // Handle custom InvalidAgeException
            System.out.println("Caught custom InvalidAgeException: " + e.getMessage());

        } finally {
            // Close the Scanner object
            input.close();
        }
    }

    // Method to validate age and throw InvalidAgeException if age is below 18
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throw custom InvalidAgeException with message
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            // Print access granted message if age is valid
            System.out.println("Access granted!");
        }
    }
}
