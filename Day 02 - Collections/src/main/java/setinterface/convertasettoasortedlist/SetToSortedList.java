package setinterface.convertasettoasortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToSortedList {
    public static void main(String[] args) {
        // Initialize a HashSet with elements
        Set<Integer> set = new HashSet<>(List.of(5, 3, 9, 1));

        // Convert the set to a sorted list
        List<Integer> list = setToSortedList(set);

        // Print the sorted list
        System.out.println("Sorted List: " + list);
    }

    // Method to convert a set to a sorted list
    public static List<Integer> setToSortedList(Set<Integer> set) {
        // Create a list from the set
        List<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        // Return the sorted list
        return list;
    }
}
