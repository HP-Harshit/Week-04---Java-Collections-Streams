package setinterface.symmetricdifference;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SymmetricDifferenceTest {

    @Test
    void testSymmetricDiff() {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

        // Expected result after finding the symmetric difference
        Set<Integer> expected = new HashSet<>(List.of(1, 2, 4, 5));

        // Actual result from the findSymmetricDiff method
        Set<Integer> actual = SymmetricDifference.findSymmetricDiff(set1, set2);

        // Assert that the expected result matches the actual result
        Assertions.assertEquals(expected, actual);
    }
}
