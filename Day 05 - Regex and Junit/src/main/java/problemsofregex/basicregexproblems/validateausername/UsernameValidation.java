package problemsofregex.basicregexproblems.validateausername;

import java.util.regex.*;

public class UsernameValidation {
    // Main method to demonstrate username validation
    public static void main(String[] args) {
        // Define the list of usernames to validate
        String[] usernames = {"user_123", "123user", "us"};

        // Iterate through the usernames and validate each one
        for (String username : usernames) {
            // Validate the username and print the result
            System.out.println(username + " is valid: " + isValidUsername(username));
        }
    }

    // Method to validate usernames
    public static boolean isValidUsername(String username) {
        // Define the regular expression for validating usernames
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);
        // Match the username against the pattern
        return pattern.matcher(username).matches();
    }
}
