package problemsofjunit.basicjunitpracticeproblems.testinglistoperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    private List<Integer> list;

    @BeforeEach
    void setup() {
        list = new ArrayList<>();
    }

    @Test
    void addElementTest() {
        // Test adding an element to the list
        assertTrue(ListManager.addElement(list, 5));
        assertTrue(ListManager.addElement(list, 10));
        assertEquals(2, list.size());
    }

    @Test
    void removeElementTest() {
        // Add elements to the list first
        ListManager.addElement(list, 5);
        ListManager.addElement(list, 10);

        // Test removing an element from the list
        assertTrue(ListManager.removeElement(list, 5));
        assertFalse(list.contains(5));
        assertEquals(1, list.size());

        // Test removing an element not in the list
        assertFalse(ListManager.removeElement(list, 20));
        assertEquals(1, list.size());
    }

    @Test
    void getSizeTest() {
        // Test the size of the list
        assertEquals(0, ListManager.getSize(list));
        ListManager.addElement(list, 5);
        assertEquals(1, ListManager.getSize(list));
        ListManager.addElement(list, 10);
        assertEquals(2, ListManager.getSize(list));
    }
}
