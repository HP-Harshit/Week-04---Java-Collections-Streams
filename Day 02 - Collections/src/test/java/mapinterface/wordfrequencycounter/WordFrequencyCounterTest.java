package mapinterface.wordfrequencycounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounterTest {

    // Test the getWords method
    @Test
    void testGetWords(){
        // Path to the input text file
        String filePath = "wordCounter.txt";

        // Get words from the file
        List<String> actualWords = WordFrequencyCounter.getWords(filePath);

        // Expected list of words
        List<String> expectedWords = new ArrayList<>(List.of("hello", "world", "hello", "java"));

        // Assert that the actual words match the expected words
        Assertions.assertEquals(expectedWords, actualWords);
    }

    // Test the countFrequency method
    @Test
    void testFreqCount(){
        // Path to the input text file
        String filePath = "wordCounter.txt";

        // Get words from the file
        List<String> actualWords = WordFrequencyCounter.getWords(filePath);

        // Count word frequency
        Map<String, Integer> freqCount = WordFrequencyCounter.countFrequency(filePath);

        // Expected word frequency map
        Map<String, Integer> expectedFreq = new HashMap<>(Map.of("world", 1, "java", 1, "hello", 2));

        // Assert that the actual frequency map matches the expected frequency map
        Assertions.assertEquals(expectedFreq, freqCount);
    }
}
