package smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    // List to store items of type T
    List<T> items;

    // Constructor to initialize the items list
    public Storage() {
        items = new ArrayList<>();
    }

    // Method to add an item to the storage
    public void addItem(T item) {
        items.add(item);
    }

    // Method to retrieve the list of items from the storage
    public List<T> getItems() {
        return items;
    }
}
