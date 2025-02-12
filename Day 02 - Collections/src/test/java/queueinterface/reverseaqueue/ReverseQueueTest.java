package queueinterface.reverseaqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseQueueTest {

    @Test
    void testReverseQueue() {
        // Initialize the actualQueue and expectedQueue
        Queue<Integer> actualQueue = new LinkedList<>(List.of(10, 20, 30));
        Queue<Integer> expectedQueue = new LinkedList<>(List.of(30, 20, 10));

        // Call the method to reverse the queue
        ReverseQueue.reverseQueue(actualQueue);

        // Assert that the reversed queue matches the expected queue
        Assertions.assertEquals(expectedQueue, actualQueue);
    }
}
