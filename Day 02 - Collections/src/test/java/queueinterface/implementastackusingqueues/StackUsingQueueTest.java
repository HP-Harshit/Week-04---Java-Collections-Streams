package queueinterface.implementastackusingqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StackUsingQueueTest {

    @Test
    void testStack() {
        // Create a new stack
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // The stack should contain [1, 2, 3]
        Assertions.assertEquals(List.of(1, 2, 3), stack.queue1);

        // Pop the top element (which is 3)
        Assertions.assertEquals(3, stack.pop());

        // Get the top element (which is now 2)
        Assertions.assertEquals(2, stack.top());

        // Check if the stack is empty (should be false)
        Assertions.assertFalse(stack.isEmpty());
    }
}
