package uncheckedexception;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

public class RunTimeExceptionTest {

    @Test
    void testArithmeticException(){
        try {
            // Prompt user to enter the first number
            System.out.println("Enter the first number: 3");
            int a = 3;

            // Prompt user to enter the second number
            System.out.println("Enter the second number: 0");
            int b = 0;

            // Perform division operation
            int res = a / b;

            // Print the result of the division
            System.out.println("Result: " + res);

        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Number can't be divided by 0, please enter valid number. " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle non-numeric input exception
            System.out.println("InputMismatchException caught! Please enter valid number. " + e.getMessage());
        }
    }

    @Test
    void testInputMismatchException() {
        try {
            // Prompt user to enter the first number
            System.out.println("Enter the first number: 2");
            int a = 2;

            // Prompt user to enter the second number
            System.out.println("Enter the second number: two");
            int b = Integer.parseInt("two"); // Simulate user entering a non-numeric value

            // Perform division operation
            int res = a / b;

            // Print the result of the division
            System.out.println("Result: " + res);

        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println("Number can't be divided by 0, please enter valid number. " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handle non-numeric input exception
            System.out.println("InputMismatchException caught! Please enter valid number. " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle non-numeric input exception
            System.out.println("NumberFormatException caught! Please enter valid number. " + e.getMessage());
        }
    }

}
