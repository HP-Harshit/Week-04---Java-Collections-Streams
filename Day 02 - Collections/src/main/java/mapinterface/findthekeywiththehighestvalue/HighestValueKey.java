package mapinterface.findthekeywiththehighestvalue;

import java.util.HashMap;
import java.util.Map;

public class HighestValueKey {
    public static void main(String[] args) {
        // Create the original map
        Map<Character, Integer> map = new HashMap<>(Map.of('A', 10, 'B', 20, 'C', 15));

        // Find and print the key with the highest value
        System.out.println("Key with Highest value is: " + getHighestValueKey(map));
    }

    // Method to find the key with the highest value in the map
    public static char getHighestValueKey(Map<Character, Integer> map){
        // Initialize variables to track the key with the highest value
        char ch = ' ';
        int max = 0;

        // Iterate through the map entries
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            // Check if the current value is greater than the max value found so far
            if(max < entry.getValue()){
                // Update the max value and the corresponding key
                max = entry.getValue();
                ch = entry.getKey();
            }
        }

        // Return the key with the highest value
        return ch;
    }
}
