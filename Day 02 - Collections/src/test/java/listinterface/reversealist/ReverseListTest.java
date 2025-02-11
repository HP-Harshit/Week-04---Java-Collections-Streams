package listinterface.reversealist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseListTest {

    @Test
    void testReverseList() {
        // Initialize ArrayList and LinkedList with values
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        // Expected results after reversing the lists
        List<Integer> expectedArrayList = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        List<Integer> expectedLinkedList = new LinkedList<>(List.of(5, 4, 3, 2, 1));

        // Reverse the lists using the method from ReverseList class
        ReverseList.reverseList(arrayList);
        ReverseList.reverseList(linkedList);

        // Assert the actual results against the expected results
        Assertions.assertEquals(expectedArrayList, arrayList);
        Assertions.assertEquals(expectedLinkedList, linkedList);
    }
}
