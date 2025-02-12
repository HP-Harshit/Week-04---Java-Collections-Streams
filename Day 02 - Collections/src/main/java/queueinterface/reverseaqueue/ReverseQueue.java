package queueinterface.reverseaqueue;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        // Initialize the queue
        Queue<Integer> queue = new LinkedList<>(List.of(10, 20, 30));
        System.out.println("Queue: " + queue);

        // Reverse the elements of the queue
        reverseQueue(queue);
        System.out.println("Reverse Queue: " + queue);
    }

    // Method to reverse the queue
    public static void reverseQueue(Queue<Integer> queue) {
        // Initialize an empty Stack
        Stack<Integer> stack = new Stack<>();

        // Move all elements from the queue to the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Move all elements back from the stack to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
