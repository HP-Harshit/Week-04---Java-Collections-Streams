package problemsofregex.advancedproblems.extractcurrencyvaluesfromatext;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CurrencyValuesExtractionTest {

    // Test method to check valid extraction of currency values
    @Test
    void testCurrencyValuesExtraction() {
        // Define the text to test
        String text = "The price is $45.99, and the discount is 10.50.";
        // List of expected currency values
        List<String> expectedValues = List.of("$45.99", "10.50");

        // Extract currency values from the text
        List<String> extractedValues = CurrencyValuesExtraction.extractCurrencyValues(text);

        // Assert that the extracted currency values match the expected values
        assertEquals(expectedValues, extractedValues);
    }

    // Test method to check extraction with no currency values
    @Test
    void testNoCurrencyValues() {
        // Define the text to test
        String text = "There are no currency values here.";
        // Empty list of expected currency values
        List<String> expectedValues = List.of();

        // Extract currency values from the text
        List<String> extractedValues = CurrencyValuesExtraction.extractCurrencyValues(text);

        // Assert that the extracted currency values match the expected values (empty list)
        assertEquals(expectedValues, extractedValues);
    }
}
