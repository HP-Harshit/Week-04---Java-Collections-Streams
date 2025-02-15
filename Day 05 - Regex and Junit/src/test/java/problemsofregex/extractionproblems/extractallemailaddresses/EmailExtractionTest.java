package problemsofregex.extractionproblems.extractallemailaddresses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;

public class EmailExtractionTest {
    // Method to extract email addresses from the given text
    private List<String> extractEmails(String text) {
        List<String> emails = new ArrayList<>();
        // Define the regular expression for matching email addresses
        String regex = "\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b";

        // Compile the regular expression into a pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the given text
        Matcher matcher = pattern.matcher(text);

        // Iterate through the found matches
        while (matcher.find()) {
            // Add the matched email address to the list
            emails.add(matcher.group());
        }

        return emails;
    }

    // Test method to check valid email extraction
    @Test
    void testEmailExtraction() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> expectedEmails = List.of("support@example.com", "info@company.org");

        // Extract emails from the text
        List<String> extractedEmails = extractEmails(text);

        // Assert that the extracted emails match the expected emails
        assertEquals(expectedEmails, extractedEmails);
    }

    // Test method to check email extraction with no emails
    @Test
    void testNoEmails() {
        String text = "There are no email addresses in this text.";
        List<String> expectedEmails = List.of();

        // Extract emails from the text
        List<String> extractedEmails = extractEmails(text);

        // Assert that the extracted emails match the expected emails (empty list)
        assertEquals(expectedEmails, extractedEmails);
    }

    // Test method to check email extraction with invalid email formats
    @Test
    void testInvalidEmails() {
        String text = "Invalid emails: support@, @example.com, user@domain, example@com.";
        List<String> expectedEmails = List.of();

        // Extract emails from the text
        List<String> extractedEmails = extractEmails(text);

        // Assert that the extracted emails match the expected emails (empty list)
        assertEquals(expectedEmails, extractedEmails);
    }
}
