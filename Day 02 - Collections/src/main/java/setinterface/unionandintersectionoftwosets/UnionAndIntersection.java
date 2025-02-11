package setinterface.unionandintersectionoftwosets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        // Initialize two sets with elements
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5));

        // Find the union and intersection of the sets
        Set<Integer> union = findUnion(set1, set2);
        Set<Integer> intersection = findIntersection(set1, set2);

        // Print the results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    // Method to find the intersection of two sets
    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>();
        for (int element : set1) {
            if (set2.contains(element)) {
                intersection.add(element);
            }
        }
        return intersection;
    }

    // Method to find the union of two sets
    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
}
