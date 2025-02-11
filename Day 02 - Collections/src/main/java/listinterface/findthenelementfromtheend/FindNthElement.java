package listinterface.findthenelementfromtheend;

import java.util.LinkedList;
import java.util.List;

public class FindNthElement {
    public static void main(String[] args) {
        // Initialize the list with elements
        List<Character> list = new LinkedList<>(List.of('A', 'B', 'C', 'D', 'E'));
        int n = 2;

        // Call the findNthElement method to find the Nth element from the end
        char ch = findNthElement(list, n);

        // Print the result
        System.out.println("The " + n + "th element from the end is: " + ch);
    }

    public static char findNthElement(List<Character> list, int n) {
        if (list == null || n <= 0) {
            throw new IllegalArgumentException("Invalid input.");
        }

        // Initialize two pointers
        int firstPointer = 0;
        int secondPointer = 0;

        // Move firstPointer n steps ahead
        while (firstPointer < n) {
            if (firstPointer >= list.size()) {
                throw new IllegalArgumentException("N is larger than the size of the list.");
            }
            firstPointer++;
        }

        // Move both pointers until firstPointer reaches the end of the list
        while (firstPointer < list.size()) {
            firstPointer++;
            secondPointer++;
        }

        // secondPointer now points to the Nth element from the end
        return list.get(secondPointer);
    }
}
