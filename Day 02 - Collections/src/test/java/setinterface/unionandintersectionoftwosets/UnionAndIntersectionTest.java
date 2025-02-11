package setinterface.unionandintersectionoftwosets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersectionTest {

    // Initialize two sets with elements
    Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

    @Test
    void testFindUnion() {
        // Find the union of the sets
        Set<Integer> union = UnionAndIntersection.findUnion(set1, set2);
        // Expected result
        Set<Integer> expected = new HashSet<>(List.of(1, 2, 3, 4, 5));
        // Assert that the actual union matches the expected result
        Assertions.assertEquals(expected, union);
    }

    @Test
    void testFindIntersection() {
        // Find the intersection of the sets
        Set<Integer> intersection = UnionAndIntersection.findIntersection(set1, set2);
        // Expected result
        Set<Integer> expected = new HashSet<>(List.of(3));
        // Assert that the actual intersection matches the expected result
        Assertions.assertEquals(expected, intersection);
    }
}
