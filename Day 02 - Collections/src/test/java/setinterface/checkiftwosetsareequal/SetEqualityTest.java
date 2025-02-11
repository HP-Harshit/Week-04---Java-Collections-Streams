package setinterface.checkiftwosetsareequal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEqualityTest {

    @Test
    void testSetEquality() {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(3, 2, 1));

        // Assert that the sets are equal
        Assertions.assertEquals(true, SetEquality.checkEquality(set1, set2));
    }

    @Test
    void testSetEqualityWithDifferentElements() {
        // Initialize two sets with different elements
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(4, 5, 6));

        // Assert that the sets are not equal
        Assertions.assertEquals(false, SetEquality.checkEquality(set1, set2));
    }

    @Test
    void testSetEqualityWithDifferentSizes() {
        // Initialize two sets with different sizes
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(1, 2));

        // Assert that the sets are not equal
        Assertions.assertEquals(false, SetEquality.checkEquality(set1, set2));
    }

    @Test
    void testSetEqualityWithEmptySets() {
        // Initialize two empty sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Assert that the empty sets are equal
        Assertions.assertEquals(true, SetEquality.checkEquality(set1, set2));
    }
}
