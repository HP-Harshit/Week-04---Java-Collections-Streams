package listinterface.removeduplicateswhilepreservingorder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicate() {
        // Initialize the list with duplicate elements
        List<Integer> list = new ArrayList<>(List.of(3, 1, 2, 2, 3, 4));

        // Expected result after removing duplicates
        Set<Integer> expectedSet = new LinkedHashSet<>(List.of(3, 1, 2, 4));

        // Call the removeDuplicate method
        Set<Integer> output = RemoveDuplicates.removeDuplicate(list);

        // Assert the actual result against the expected result
        Assertions.assertEquals(expectedSet, output);
    }
}
