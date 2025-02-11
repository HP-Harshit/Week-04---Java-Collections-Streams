package listinterface.findfrequencyofelements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FindFrequencyTest {

    @Test
    void testGetFrequency() {
        // Initialize the list with elements
        List<String> list = new ArrayList<>(List.of("apple", "banana", "apple", "orange"));

        // Expected result after calling getFrequency
        Map<String, Integer> expectedFrequency = Map.of("apple", 2, "banana", 1, "orange", 1);

        // Call the getFrequency method to find the frequency of elements
        Map<String, Integer> frequency = FindFrequency.getFrequency(list);

        // Assert the actual result against the expected result
        Assertions.assertEquals(expectedFrequency, frequency);
    }
}
