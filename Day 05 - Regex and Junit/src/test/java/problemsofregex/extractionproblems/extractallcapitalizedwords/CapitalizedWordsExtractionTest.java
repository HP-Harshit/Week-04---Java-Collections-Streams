package problemsofregex.extractionproblems.extractallcapitalizedwords;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class CapitalizedWordsExtractionTest {

    // Test method to check valid extraction of capitalized words
    @Test
    void testCapitalizedWordsExtraction() {
        // Define the text to test
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        // List of expected capitalized words
        List<String> expectedWords = List.of("The", "Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York");

        // Extract capitalized words from the text
        List<String> extractedWords = CapitalizedWordsExtraction.extractCapitalizedWords(text);

        // Assert that the extracted words match the expected words
        assertEquals(expectedWords, extractedWords);
    }

    // Test method to check extraction with no capitalized words
    @Test
    void testNoCapitalizedWords() {
        // Define the text to test
        String text = "there are no capitalized words here.";
        // Empty list of expected capitalized words
        List<String> expectedWords = List.of();

        // Extract capitalized words from the text
        List<String> extractedWords = CapitalizedWordsExtraction.extractCapitalizedWords(text);

        // Assert that the extracted words match the expected words (empty list)
        assertEquals(expectedWords, extractedWords);
    }
}
