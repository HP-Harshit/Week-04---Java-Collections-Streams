package queueinterface.generatebinarynumbersusingaqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryNumbersUsingQueueTest {

    @Test
    void testGenerateBinary() {
        // Define the number of binary numbers to generate
        int n = 5;

        // Generate the actual binary numbers using the method
        Queue<String> actual = BinaryNumbersUsingQueue.generateBinary(n);

        // Define the expected binary numbers
        Queue<String> expected = new LinkedList<>(List.of("1", "10", "11", "100", "101"));

        // Assert that the actual binary numbers match the expected binary numbers
        Assertions.assertEquals(expected, actual);
    }
}
