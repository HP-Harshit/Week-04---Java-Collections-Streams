package listinterface.findthenelementfromtheend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class FindNthElementTest {

    @Test
    void testFindNthElement() {
        // Initialize the list with elements
        List<Character> list = new LinkedList<>(List.of('A', 'B', 'C', 'D', 'E'));
        int n = 2; // Specify the position from the end
        char expectedCh = 'D'; // Expected result

        // Call the findNthElement method to find the Nth element from the end
        char ch = FindNthElement.findNthElement(list, n);

        // Assert the actual result against the expected result
        Assertions.assertEquals(expectedCh, ch);
    }

    @Test
    void testFindNthElementWithInvalidN() {
        // Initialize the list with elements
        List<Character> list = new LinkedList<>(List.of('A', 'B', 'C', 'D', 'E'));
        // Specify an invalid position from the end
        int n = 7;

        // Assert that an IllegalArgumentException is thrown
        Assertions.assertThrows(IllegalArgumentException.class,()-> FindNthElement.findNthElement(list, n));
    }

    @Test
    void testFindNthElementWithEmptyList() {
        // Initialize an empty list
        List<Character> list = new LinkedList<>();
        int n = 1; // Specify the position from the end

        // Assert that an IllegalArgumentException is thrown
        Assertions.assertThrows(IllegalArgumentException.class,()-> FindNthElement.findNthElement(list, n));
    }
}
