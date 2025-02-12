package queueinterface.generatebinarynumbersusingaqueue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersUsingQueue {
    public static void main(String[] args) {
        // Define the number of binary numbers to generate
        int n = 5;

        // Generate the first n binary numbers
        Queue<String> binaryNumbers = generateBinary(n);

        // Print the generated binary numbers
        System.out.println("First \"" + n + "\" Binary Numbers are: " + binaryNumbers);
    }

    // Method to generate the first n binary numbers
    public static Queue<String> generateBinary(int n) {
        // Initialize an empty queue to store binary numbers
        Queue<String> binaryNumbers = new LinkedList<>();

        // Iterate from 1 to n to generate binary numbers
        for (int i = 1; i <= n; i++) {
            int temp = i;
            String str = "";

            // Convert the current number to its binary representation
            while (temp != 0) {
                if ((temp & 1) == 1) {
                    str = "1" + str;
                } else {
                    str = "0" + str;
                }
                temp = temp >> 1;
            }

            // Add the binary number to the queue
            binaryNumbers.add(str);
        }

        // Return the queue containing the generated binary numbers
        return binaryNumbers;
    }
}
