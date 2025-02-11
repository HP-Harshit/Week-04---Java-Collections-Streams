package listinterface.findfrequencyofelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        // Initialize the list with elements
        List<String> list = new ArrayList<>(List.of("apple", "banana", "apple", "orange"));
        // Call the getFrequency method to find the frequency of elements
        Map<String, Integer> frequency = getFrequency(list);

        // Print the list and its frequency map
        System.out.println("List: " + list);
        System.out.println("Frequency of List: " + frequency);
    }

    public static Map<String, Integer> getFrequency(List<String> list) {
        // Initialize a map to store the frequency of each element
        Map<String, Integer> frequency = new HashMap<>();
        // Iterate over the list
        for (String str : list) {
            // If the element is already in the map, increment its count
            if (frequency.containsKey(str)) {
                frequency.put(str, frequency.get(str) + 1);
            } else {
                // Otherwise, add the element to the map with a count of 1
                frequency.put(str, 1);
            }
        }
        // Return the result
        return frequency;
    }
}
