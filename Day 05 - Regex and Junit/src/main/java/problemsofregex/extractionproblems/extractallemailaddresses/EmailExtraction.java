package problemsofregex.extractionproblems.extractallemailaddresses;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class EmailExtraction {
    // Main method to demonstrate email extraction
    public static void main(String[] args) {
        // Define the text containing the email addresses
        String text = "Contact us at support@example.com and info@company.org";

        // Extract and print email addresses from the text
        List<String> emails = extractEmails(text);
        for (String email : emails) {
            System.out.println("Email found: " + email);
        }
    }

    // Method to extract email addresses from the given text
    public static List<String> extractEmails(String text) {
        // Define the regular expression for matching email addresses
        String regex = "\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // List to store found email addresses
        List<String> emails = new ArrayList<>();

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched email address to the list
            emails.add(matcher.group());
        }

        return emails;
    }
}
