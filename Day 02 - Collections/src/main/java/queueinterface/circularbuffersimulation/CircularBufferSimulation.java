package queueinterface.circularbuffersimulation;

public class CircularBufferSimulation {
    public static void main(String[] args) {
        // Create a circular buffer of size 3
        CircularBuffer buffer = new CircularBuffer(3);

        // Insert elements into the buffer
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        System.out.println("Buffer: " + java.util.Arrays.toString(buffer.getBuffer()));

        // Insert another element (this will overwrite the oldest element)
        buffer.insert(4);
        System.out.println("Buffer: " + java.util.Arrays.toString(buffer.getBuffer()));
    }
}
