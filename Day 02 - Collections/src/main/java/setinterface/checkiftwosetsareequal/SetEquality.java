package setinterface.checkiftwosetsareequal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEquality {
    public static void main(String[] args) {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(3, 2, 1));

        // Check if both sets are equal and print the result
        System.out.println("Both sets are " + (checkEquality(set1, set2) ? "Equal" : "Not-Equal"));
    }

    public static boolean checkEquality(Set<Integer> set1, Set<Integer> set2) {
        // Check if the sizes of the sets are different
        if (set1.size() != set2.size()) {
            return false;
        }

        // Iterate through the elements of the first set
        for (int element : set1) {
            // If an element in set1 is not present in set2, return false
            if (!set2.contains(element)) {
                return false;
            }
        }

        // If all elements match, return true
        return true;
    }
}
