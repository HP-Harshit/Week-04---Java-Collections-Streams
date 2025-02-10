package smartwarehousemanagementsystem;

import java.util.List;

public class Utility {

    // Method to display information for all items in the list
    public static void displayAllItems(List<? extends WarehouseItem> items) {

        // Loop through each item in the list
        for (WarehouseItem item : items) {

            // Display information about the item
            item.displayInfo();
        }
    }
}
