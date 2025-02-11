package listinterface.rotateelementsinalist;

import java.util.ArrayList;
import java.util.List;

public class RotateElements {
    public static void main(String[] args) {
        // Initialize the list with elements
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        int rotation = 2;

        // Print the list before rotation
        System.out.println("===== List before rotation =====");
        System.out.println(list);

        // Call the rotateList method to rotate the elements
        rotateList(list, rotation);

        // Print the list after rotation
        System.out.println("===== List after \"" + rotation + "\" rotation =====");
        System.out.println(list);
    }

    public static void rotateList(List<Integer> list, int rotation) {
        int size = list.size();

        // If the list is empty or has only one element, return as no rotation is needed
        if (size <= 0) {
            return;
        }

        // Perform the rotation the specified number of times
        while (rotation > 0) {
            // Store the first element in a temporary variable
            int temp = list.get(0);

            // Shift all elements to the left by one position
            for (int i = 0; i < size - 1; i++) {
                list.set(i, list.get(i + 1));
            }

            // Set the last element to the previously stored first element
            list.set(size - 1, temp);

            // Decrement the rotation count
            rotation--;
        }
    }
}
