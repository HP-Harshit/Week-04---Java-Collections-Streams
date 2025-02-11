package setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

        // Find the symmetric difference of the sets
        Set<Integer> symmetricDifference = findSymmetricDiff(set1, set2);

        // Print the symmetric difference
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }

    public static Set<Integer> findSymmetricDiff(Set<Integer> set1, Set<Integer> set2) {
        // Create a new set to store the symmetric difference
        Set<Integer> symmetricDiff = new HashSet<>(set1);

        // Add all elements of set2 to the symmetricDiff set
        symmetricDiff.addAll(set2);

        // Create a set to store the intersection of set1 and set2
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Remove all elements of the intersection from the symmetricDiff set
        symmetricDiff.removeAll(intersection);

        // Return the symmetric difference
        return symmetricDiff;
    }
}
