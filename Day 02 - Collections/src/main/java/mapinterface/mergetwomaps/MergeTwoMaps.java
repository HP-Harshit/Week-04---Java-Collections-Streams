package mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        // Create the first map
        Map<Character, Integer> map1 = new HashMap<>(Map.of('A', 1, 'B', 2));

        // Create the second map
        Map<Character, Integer> map2 = new HashMap<>(Map.of('B', 3, 'C', 4));

        // Merge the two maps
        Map<Character, Integer> finalMap = mergeMap(map1, map2);

        // Print the final merged map
        System.out.println(finalMap);
    }

    // Method to merge two maps
    public static Map<Character, Integer> mergeMap(Map<Character, Integer> map1, Map<Character, Integer> map2){
        // Create a new map to hold the merged values
        Map<Character, Integer> map = new HashMap<>();

        // Iterate through the entries of the first map
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            // Add the values from the first map to the new map
            map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        // Iterate through the entries of the second map
        for(Map.Entry<Character, Integer> entry : map2.entrySet()){
            // Add the values from the second map to the new map, summing values if the key already exists
            map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        // Return the merged map
        return map;
    }
}
