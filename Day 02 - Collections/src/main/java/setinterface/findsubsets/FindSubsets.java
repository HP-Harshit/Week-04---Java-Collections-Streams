package setinterface.findsubsets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSubsets {
    public static void main(String[] args) {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(1, 2, 3, 4));

        // Check if set1 is a subset of set2
        boolean isSubset = isSubset(set1, set2);

        // Print the result
        System.out.println("Is set1 a subset of set2? " + isSubset);
    }

    public static boolean isSubset(Set<Integer> subset, Set<Integer> superset) {
        // Check if all elements of subset are contained in superset
        for (Integer element : subset) {
            if (!superset.contains(element)) {
                return false;
            }
        }
        return true;
    }
}
