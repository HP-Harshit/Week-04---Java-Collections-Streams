package setinterface.convertasettoasortedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedListTest {

    @Test
    void testSetToSortedList() {
        // Initialize a HashSet with elements
        Set<Integer> set = new HashSet<>(List.of(5, 3, 9, 1));

        // Expected result after sorting
        List<Integer> expected = List.of(1, 3, 5, 9);

        // Actual result from the setToSortedList method
        List<Integer> actual = SetToSortedList.setToSortedList(set);

        // Assert that the expected result matches the actual result
        Assertions.assertEquals(expected, actual);
    }
}
