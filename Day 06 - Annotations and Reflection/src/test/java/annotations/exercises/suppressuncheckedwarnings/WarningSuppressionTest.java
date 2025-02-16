package annotations.exercises.suppressuncheckedwarnings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;

public class WarningSuppressionTest {

    @Test
    public void testAddElementsToList() {
        List rawList = new ArrayList(); // Create an ArrayList without generics

        WarningSuppression.addElementsToList(rawList, "Element 1");
        WarningSuppression.addElementsToList(rawList, "Element 2");
        WarningSuppression.addElementsToList(rawList, "Element 3");

        // Verify that the elements were added to the list
        assertTrue(rawList.contains("Element 1"));
        assertTrue(rawList.contains("Element 2"));
        assertTrue(rawList.contains("Element 3"));
    }
}
