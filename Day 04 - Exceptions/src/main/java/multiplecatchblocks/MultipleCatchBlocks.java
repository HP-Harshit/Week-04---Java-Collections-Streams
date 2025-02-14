package multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        // Initialize the array with sample values
        int[] array = {1, 2, 3, 4, 5};

        // Create a Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        try {
            // Get the index from the user{
            System.out.println("Enter the index number: ");
            int index = input.nextInt();

            // Retrieve and print the value at the given index in the array
            retrieveAndPrintValue(array, index);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the provided index is out of the array's bounds
            System.out.println("Invalid index! " + e.getMessage());

        } catch (NullPointerException e) {
            // Handle the case where the array is null
            System.out.println("Array is not initialized! " + e.getMessage());

        } finally {
            // Close the Scanner object to release resources
            input.close();
        }
    }

    // Method to retrieve and print the value at the given index in the array
    public static void retrieveAndPrintValue(int[] array, int index) throws IndexOutOfBoundsException {
        if (index >= array.length){
            throw new IndexOutOfBoundsException("Array Index out of bound");
        }
        // Retrieve the value at the specified index in the array
        int value = array[index];

        // Print the retrieved value
        System.out.println("Value at index " + index + ": " + value);
    }
}
