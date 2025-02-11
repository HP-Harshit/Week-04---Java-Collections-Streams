package listinterface.removeduplicateswhilepreservingorder;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Initialize the list with duplicate elements
        List<Integer> list = new ArrayList<>(List.of(3, 1, 2, 2, 3, 4));

        // Remove duplicates and preserve order
        Set<Integer> result = removeDuplicate(list);

        // Print the list with duplicate elements
        System.out.println("===== List with duplicate elements =====");
        System.out.println(list);

        // Print the list without duplicate elements
        System.out.println("===== List without duplicate elements =====");
        System.out.println(result);
    }

    public static Set<Integer> removeDuplicate(List<Integer> list) {
        // Use LinkedHashSet to preserve order while removing duplicates
        Set<Integer> res = new LinkedHashSet<>();
        for (int i : list) {
            res.add(i);
        }
        return res;
    }
}
