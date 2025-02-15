package problemsofregex.advancedproblems.findrepeatingwordsinasentence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindRepeatingWordsTest {

    // Test method to check valid extraction of repeating words
    @Test
    void testRepeatingWordsExtraction() {
        // Define the text to test
        String text = "This is is a repeated repeated word test.";
        // List of expected repeating words
        List<String> expectedWords = List.of("is", "repeated");

        // Extract repeating words from the text
        List<String> extractedWords = FindRepeatingWords.findRepeatingWords(text);

        // Assert that the extracted repeating words match the expected words
        assertEquals(expectedWords, extractedWords);
    }

    // Test method to check extraction with no repeating words
    @Test
    void testNoRepeatingWords() {
        // Define the text to test
        String text = "There are no repeating words in this sentence.";
        // Empty list of expected repeating words
        List<String> expectedWords = List.of();

        // Extract repeating words from the text
        List<String> extractedWords = FindRepeatingWords.findRepeatingWords(text);

        // Assert that the extracted repeating words match the expected words (empty list)
        assertEquals(expectedWords, extractedWords);
    }
}
