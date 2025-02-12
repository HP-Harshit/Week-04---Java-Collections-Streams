package queueinterface.implementastackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    // Push element x onto stack
    public void push(int x) {
        // Add the element to queue1
        queue1.add(x);
    }

    // Removes the element on top of the stack and returns that element
    public int pop() {
        // Move all elements except the last to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // The last element of queue1 is the top element of the stack
        int top = queue1.remove();

        // Swap the names of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    // Get the top element
    public int top() {
        // Move all elements except the last to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // The last element of queue1 is the top element of the stack
        int top = queue1.peek();

        // Move the last element to queue2
        queue2.add(queue1.remove());

        // Swap the names of queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;
    }

    // Returns whether the stack is empty
    public boolean isEmpty() {
        // Check if queue1 is empty
        return queue1.isEmpty();
    }
}
