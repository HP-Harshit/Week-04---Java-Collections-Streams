package problemsofregex.advancedproblems.validateasocialsecuritynumber;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SSNValidationTest {

    // Test method to check extracting SSNs from a text
    @Test
    void testExtractSSNs() {
        // Define the text to test
        String text = "My SSN is 123-45-6789. Another number is 987-65-4321.";
        // List of expected SSNs
        List<String> expectedSSNs = List.of("123-45-6789", "987-65-4321");

        // Extract SSNs from the text
        List<String> extractedSSNs = SSNValidation.extractSSNs(text);

        // Assert that the extracted SSNs match the expected SSNs
        assertEquals(expectedSSNs, extractedSSNs);
    }

    // Test method to check extraction with no SSNs
    @Test
    void testNoSSNs() {
        // Define the text to test
        String text = "There are no SSNs in this text.";
        // Empty list of expected SSNs
        List<String> expectedSSNs = List.of();

        // Extract SSNs from the text
        List<String> extractedSSNs = SSNValidation.extractSSNs(text);

        // Assert that the extracted SSNs match the expected SSNs (empty list)
        assertEquals(expectedSSNs, extractedSSNs);
    }

    // Test method to check valid SSNs
    @Test
    void testValidSSNs() {
        // Assert that a valid SSN "123-45-6789" returns true
        assertTrue(SSNValidation.isValidSSN("123-45-6789"));

        // Assert that a valid SSN "987-65-4321" returns true
        assertTrue(SSNValidation.isValidSSN("987-65-4321"));
    }

    // Test method to check invalid SSNs
    @Test
    void testInvalidSSN() {
        // Assert that an invalid SSN "123456789" returns false
        assertFalse(SSNValidation.isValidSSN("123456789")); // Missing dashes

        // Assert that an invalid SSN "12-345-6789" returns false
        assertFalse(SSNValidation.isValidSSN("12-345-6789")); // Incorrect format

        // Assert that an invalid SSN "123-45-678" returns false
        assertFalse(SSNValidation.isValidSSN("123-45-678")); // Too short

        // Assert that an invalid SSN "123-45-67890" returns false
        assertFalse(SSNValidation.isValidSSN("123-45-67890")); // Too long
    }
}
