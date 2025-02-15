package problemsofregex.extractionproblems.extractdates;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DateExtractionTest {

    // Test method to check valid extraction of dates
    @Test
    void testDateExtraction() {
        // Define the text to test
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        // List of expected dates
        List<String> expectedDates = List.of("12/05/2023", "15/08/2024", "29/02/2020");

        // Extract dates from the text
        List<String> extractedDates = DateExtraction.extractDates(text);

        // Assert that the extracted dates match the expected dates
        assertEquals(expectedDates, extractedDates);
    }

    // Test method to check extraction with no dates
    @Test
    void testNoDates() {
        // Define the text to test
        String text = "There are no dates in this text.";
        // Empty list of expected dates
        List<String> expectedDates = List.of();

        // Extract dates from the text
        List<String> extractedDates = DateExtraction.extractDates(text);

        // Assert that the extracted dates match the expected dates (empty list)
        assertEquals(expectedDates, extractedDates);
    }

    // Test method to check extraction with invalid date formats
    @Test
    void testInvalidDates() {
        // Define the text to test
        String text = "Invalid dates: 2023/05/12, 15-08-2024, 29.02.2020.";
        // Empty list of expected dates
        List<String> expectedDates = List.of();

        // Extract dates from the text
        List<String> extractedDates = DateExtraction.extractDates(text);

        // Assert that the extracted dates match the expected dates (empty list)
        assertEquals(expectedDates, extractedDates);
    }
}
