package problemsofregex.basicregexproblems.validateahexcolorcode;

import java.util.regex.*;

public class HexColorCodeValidation {
    // Main method to demonstrate hex color code validation
    public static void main(String[] args) {
        // Define the list of Hex Color Code to validate
        String[] hexColorCodes = {"#FFA500", "#ff4500", "#123"};

        // Iterate through the Hex Color Code and validate each one
        for (String colorCode : hexColorCodes) {
            // Validate the Hex Color Code and print the result
            System.out.println(colorCode + " is valid: " + isValidHexColorCode(colorCode));
        }
    }

    // Method to validate hex color codes
    public static boolean isValidHexColorCode(String colorCode) {
        // Define the regular expression for Hex Color Code
        String regex = "^#[a-fA-F0-9]{6}$";
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);
        // Match the Hex Color Code against the pattern
        return pattern.matcher(colorCode).matches();
    }
}
