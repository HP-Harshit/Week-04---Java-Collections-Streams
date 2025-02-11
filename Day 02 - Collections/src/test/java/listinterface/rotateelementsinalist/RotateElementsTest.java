package listinterface.rotateelementsinalist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RotateElementsTest {

    @Test
    void testRotateElements() {
        // Initialize the list with elements
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        int rotation = 2;

        // Expected result after rotating the list
        List<Integer> expectedList = new ArrayList<>(List.of(30, 40, 50, 10, 20));

        // Call the rotateList method to rotate the elements
        RotateElements.rotateList(list, rotation);

        // Assert the actual result against the expected result
        Assertions.assertEquals(expectedList, list);
    }
}
