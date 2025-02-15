package problemsofregex.advancedproblems.validateasocialsecuritynumber;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class SSNValidation {
    // Main method to demonstrate SSN extraction and validation
    public static void main(String[] args) {
        // Define the text containing the SSNs
        String text = "My SSN is 123-45-6789. Another number is 123456789.";

        // Extract and print SSNs from the text
        List<String> ssns = extractSSNs(text);
        for (String ssn : ssns) {
            System.out.println("SSN found: " + ssn);
        }

        // Test individual SSNs for validation
        String[] ssnList = {"123-45-6789", "123456789"};
        for (String ssn : ssnList) {
            boolean isValid = isValidSSN(ssn);
            System.out.println(ssn + " is valid: " + isValid);
        }
    }

    // Method to extract SSNs from the given text
    public static List<String> extractSSNs(String text) {
        // Define the regular expression for matching SSNs
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // List to store found SSNs
        List<String> ssns = new ArrayList<>();

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched SSN to the list
            ssns.add(matcher.group());
        }

        return ssns;
    }

    // Method to validate an SSN
    public static boolean isValidSSN(String ssn) {
        // Define the regular expression for validating SSNs
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the SSN against the pattern
        return pattern.matcher(ssn).matches();
    }
}
