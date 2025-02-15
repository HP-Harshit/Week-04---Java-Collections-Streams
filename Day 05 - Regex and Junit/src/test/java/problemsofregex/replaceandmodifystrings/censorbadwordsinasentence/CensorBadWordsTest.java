package problemsofregex.replaceandmodifystrings.censorbadwordsinasentence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CensorBadWordsTest {

    // Test method to check censoring of bad words
    @Test
    void testCensorBadWords() {
        // Define the sentence to test
        String sentence = "This is a damn bad example with some stupid words.";
        // Define the list of bad words to censor
        String[] badWords = {"damn", "stupid"};
        // Define the expected censored sentence
        String expectedCensoredSentence = "This is a **** bad example with some **** words.";

        // Censor bad words in the sentence
        String censoredSentence = CensorBadWords.censorBadWords(sentence, badWords);

        // Assert that the censored sentence matches the expected sentence
        assertEquals(expectedCensoredSentence, censoredSentence);
    }

    // Test method to check censoring with no bad words
    @Test
    void testNoBadWords() {
        // Define the sentence to test
        String sentence = "This is a clean example with no bad words.";
        // Define the list of bad words to censor
        String[] badWords = {"damn", "stupid"};
        // Define the expected censored sentence (should be unchanged)
        String expectedCensoredSentence = "This is a clean example with no bad words.";

        // Censor bad words in the sentence
        String censoredSentence = CensorBadWords.censorBadWords(sentence, badWords);

        // Assert that the censored sentence matches the expected sentence
        assertEquals(expectedCensoredSentence, censoredSentence);
    }
}
