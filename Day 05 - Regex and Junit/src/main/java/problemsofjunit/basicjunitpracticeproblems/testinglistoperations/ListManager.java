package problemsofjunit.basicjunitpracticeproblems.testinglistoperations;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
    public static void main(String[] args) {
        // Create a new list of integers
        List<Integer> list = new ArrayList<>();

        // Example usage of the methods
        addElement(list, 5);
        addElement(list, 10);
        removeElement(list, 5);
        System.out.println("List size: " + getSize(list));
    }

    // Method to add an element to the list
    public static boolean addElement(List<Integer> list, int element) {
        list.add(element);
        return list.contains(element);
    }

    // Method to remove an element from the list
    public static boolean removeElement(List<Integer> list, int element) {
        boolean removed = list.remove(Integer.valueOf(element));
        return !list.contains(element) && removed;
    }

    // Method to get the size of the list
    public static int getSize(List<Integer> list) {
        return list.size();
    }
}
