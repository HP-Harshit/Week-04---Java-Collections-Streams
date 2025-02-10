package smartwarehousemanagementsystem;

public class Furniture extends WarehouseItem {

    // Constructor to initialize the furniture item with its name and price
    public Furniture(String name, double price) {
        super(name, price);
    }

    // Method to display information about the furniture item
    public void displayInfo() {
        System.out.println("\n===== Furniture Item =====");
        System.out.println("Name: " + name);  // Display the name of the item
        System.out.println("Price: " + price);  // Display the price of the item
    }
}
