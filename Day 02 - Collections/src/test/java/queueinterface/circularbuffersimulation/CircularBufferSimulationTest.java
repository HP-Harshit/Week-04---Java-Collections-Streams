package queueinterface.circularbuffersimulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircularBufferSimulationTest {

    @Test
    void testCircularBuffer() {
        // Create a circular buffer with size 3
        CircularBuffer buffer = new CircularBuffer(3);

        // Insert elements into the buffer
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        // Check the current buffer content
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, buffer.getBuffer());
        System.out.println("Buffer after inserting 1, 2, 3: " + java.util.Arrays.toString(buffer.getBuffer()));

        // Insert another element (this will overwrite the oldest element)
        buffer.insert(4);

        // Check the buffer content after overwriting
        Assertions.assertArrayEquals(new int[]{2, 3, 4}, buffer.getBuffer());
        System.out.println("Buffer after inserting 4: " + java.util.Arrays.toString(buffer.getBuffer()));
    }
}
