package setinterface.findsubsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubsetsTest {

    @Test
    void testIsSubset() {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(1, 2, 3, 4));

        // Assert that set1 is a subset of set2
        Assertions.assertTrue(FindSubsets.isSubset(set1, set2));
    }

    @Test
    void testIsNotSubset() {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(1, 4, 5));

        // Assert that set1 is not a subset of set2
        Assertions.assertFalse(FindSubsets.isSubset(set1, set2));
    }

    @Test
    void testEmptySubset() {
        // Initialize an empty set and a non-empty set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(List.of(1, 2, 3));

        // Assert that an empty set is a subset of any set
        Assertions.assertTrue(FindSubsets.isSubset(set1, set2));
    }

    @Test
    void testEmptySuperset() {
        // Initialize a non-empty set and an empty set
        Set<Integer> set1 = new HashSet<>(List.of(1, 2));
        Set<Integer> set2 = new HashSet<>();

        // Assert that no non-empty set is a subset of an empty set
        Assertions.assertFalse(FindSubsets.isSubset(set1, set2));
    }

    @Test
    void testIdenticalSets() {
        // Initialize two identical sets
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(1, 2, 3));

        // Assert that a set is a subset of itself
        Assertions.assertTrue(FindSubsets.isSubset(set1, set2));
    }
}
