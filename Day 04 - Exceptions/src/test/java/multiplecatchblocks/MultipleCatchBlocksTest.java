package multiplecatchblocks;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MultipleCatchBlocksTest {

    // ByteArrayInputStream to simulate input for testing
    private ByteArrayInputStream testIn;

    // Method to provide simulated input
    private void provideInput(String data) {
        // Convert string data to byte array and create ByteArrayInputStream
        testIn = new ByteArrayInputStream(data.getBytes());
        // Set System.in to ByteArrayInputStream to simulate user input
        System.setIn(testIn);
    }

    @Test
    public void testValidIndex() {
        // Simulate user input for a valid index (2)
        provideInput("2\n");

        // Test case: Valid index should not throw any exception
        assertDoesNotThrow(() -> {
            MultipleCatchBlocks.main(new String[]{});
        }, "Valid index should not throw an exception.");
    }

    @Test
    public void testInvalidIndex() {
        // Simulate user input for an invalid index (10)
        provideInput("10\n");

        // Test case: Invalid index should throw ArrayIndexOutOfBoundsException
        assertThrows(IndexOutOfBoundsException.class, () -> {
            MultipleCatchBlocks.main(new String[]{});
        }, "Invalid index should throw ArrayIndexOutOfBoundsException.");
    }

    @Test
    public void testNullArray() {
        // Create a null array to simulate NullPointerException scenario
        int[] array = null;

        // Set a valid index for testing
        int index = 2;

        // Test case: Null array should throw NullPointerException
        assertThrows(NullPointerException.class, () -> {
            MultipleCatchBlocks.retrieveAndPrintValue(array, index);
        }, "Null array should throw NullPointerException.");
    }
}
