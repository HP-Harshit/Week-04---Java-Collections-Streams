package mapinterface.mergetwomaps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMapsTest {

    // Test method for merging two maps
    @Test
    void testMergeMap(){
        // Create the first map
        Map<Character, Integer> map1 = new HashMap<>(Map.of('A', 1, 'B', 2));

        // Create the second map
        Map<Character, Integer> map2 = new HashMap<>(Map.of('B', 3, 'C', 4));

        // Merge the two maps
        Map<Character, Integer> actualMap = MergeTwoMaps.mergeMap(map1, map2);

        // Expected merged map
        Map<Character, Integer> expectedMap = new HashMap<>(Map.of('A', 1, 'B', 5, 'C', 4));

        // Assert that the actual merged map matches the expected map
        Assertions.assertEquals(expectedMap, actualMap);
    }
}
