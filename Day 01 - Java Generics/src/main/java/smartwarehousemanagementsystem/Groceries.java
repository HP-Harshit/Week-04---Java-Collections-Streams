package smartwarehousemanagementsystem;

public class Groceries extends WarehouseItem {

    // Constructor to initialize the groceries item with its name and price
    public Groceries(String name, double price) {
        super(name, price);
    }

    // Method to display information about the groceries item
    public void displayInfo() {
        System.out.println("\n===== Groceries Item =====");
        System.out.println("Name: " + name);  // Display the name of the item
        System.out.println("Price: " + price);  // Display the price of the item
    }
}
