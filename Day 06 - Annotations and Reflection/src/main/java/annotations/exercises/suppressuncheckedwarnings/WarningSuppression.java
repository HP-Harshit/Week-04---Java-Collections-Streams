package annotations.exercises.suppressuncheckedwarnings;

import java.util.ArrayList;
import java.util.List;

public class WarningSuppression {

    public static void main(String[] args) {
        // Create an ArrayList without generics
        List list = new ArrayList();

        // Add elements to the list
        addElementsToList(list, "Element 1");
        addElementsToList(list, "Element 2");
        addElementsToList(list, "Element 3");

        // Print the elements of the list
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // Suppress unchecked warnings for this method and make it static
    @SuppressWarnings("unchecked")
    public static void addElementsToList(List list, Object element) {
        list.add(element); // Add element to the list
    }
}
