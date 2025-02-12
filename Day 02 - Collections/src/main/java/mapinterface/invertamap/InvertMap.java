package mapinterface.invertamap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {
        // Create the original map
        Map<Character, Integer> map = new HashMap<>(Map.of('A', 1, 'B', 2, 'C', 1));

        // Invert the map
        Map<Integer, List<Character>> mapInvert = invertMap(map);

        // Print the inverted map
        System.out.println(mapInvert);
    }

    // Method to invert the map
    public static Map<Integer, List<Character>> invertMap(Map<Character, Integer> map){
        // Create a new map to hold the inverted map
        Map<Integer, List<Character>> mapInvert = new HashMap<>();

        // Iterate through the original map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            Character key = entry.getKey();

            // If the value is already in the inverted map, add the key to the list
            if (!mapInvert.containsKey(value)) {
                mapInvert.put(value, new ArrayList<>());
            }
            mapInvert.get(value).add(key);
        }

        // Return the inverted map
        return mapInvert;
    }
}
