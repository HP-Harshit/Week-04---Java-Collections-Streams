package mapinterface.findthekeywiththehighestvalue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HighestValueKeyTest {

    // Test method for finding the key with the highest value
    @Test
    void testHighestValueKey(){
        // Create the original map
        Map<Character, Integer> map = new HashMap<>(Map.of('A', 10, 'B', 20, 'C', 15));

        // Expected key with the highest value
        char ch = 'B';

        // Assert that the actual key with the highest value matches the expected key
        Assertions.assertEquals(ch, HighestValueKey.getHighestValueKey(map));
    }
}
