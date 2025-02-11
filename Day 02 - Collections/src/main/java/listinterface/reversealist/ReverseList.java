package listinterface.reversealist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Initialize ArrayList and LinkedList with values
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> linkedList = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        // Display lists before reversing
        System.out.println("===== Before Reversing =====");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Reverse the lists
        reverseList(arrayList);
        reverseList(linkedList);

        // Display lists after reversing
        System.out.println("===== After Reversing =====");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }

    public static void reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;

        // Swap elements from both ends of the list until the pointers meet in the middle
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;  right--;
        }
    }
}
