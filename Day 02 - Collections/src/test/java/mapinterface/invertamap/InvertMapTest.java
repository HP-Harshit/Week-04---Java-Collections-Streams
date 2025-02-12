package mapinterface.invertamap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMapTest {

    // Test method for inverting a map
    @Test
    void testMapInvert(){
        // Create the original map
        Map<Character, Integer> map = new HashMap<>(Map.of('A', 1, 'B', 2, 'C', 1));

        // Invert the map
        Map<Integer, List<Character>> mapInvert = InvertMap.invertMap(map);

        // Expected inverted map
        Map<Integer, List<Character>> expectedMap = new HashMap<>(Map.of(1, List.of('A', 'C'), 2, List.of('B')));

        // Assert that the actual inverted map matches the expected map
        Assertions.assertEquals(expectedMap, mapInvert);
    }
}
