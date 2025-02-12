package queueinterface.implementastackusingqueues;

public class StackUsingQueue {
    public static void main(String[] args) {
        // Create a new stack
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the current stack
        System.out.println("Stack: " + stack.queue1);

        // Pop the top element and print it
        System.out.println("Popped element: " + stack.pop());

        // Get the top element and print it
        System.out.println("Top element: " + stack.top());

        // Check if the stack is empty and print the result
        System.out.println("Is Stack Empty: " + stack.isEmpty());
    }
}
