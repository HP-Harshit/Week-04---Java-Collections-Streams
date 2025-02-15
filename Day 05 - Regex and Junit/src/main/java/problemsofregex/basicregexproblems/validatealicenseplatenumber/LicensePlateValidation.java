package problemsofregex.basicregexproblems.validatealicenseplatenumber;

import java.util.regex.*;

public class LicensePlateValidation {
    public static void main(String[] args) {
        // Define the list of License Plate Numbers to validate
        String[] numbers = {"AB1234", "A12345", "Ab1234"};

        // Iterate through the License Plate Numbers and validate each one
        for (String number : numbers) {
            // Validate the License Plate Number and print the result
            System.out.println(number + " is valid: " + isValidLicensePlate(number));
        }
    }

    // Method to validate license plate numbers
    public static boolean isValidLicensePlate(String number) {
        // Define the regular expression for validating License Plate Number
        String regex = "^[A-Z]{2}[0-9]{4}$";
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);
        // Match the License Plate Number against the pattern
        return pattern.matcher(number).matches();
    }
}
