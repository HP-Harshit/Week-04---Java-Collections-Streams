package smartwarehousemanagementsystem;

public class Electronics extends WarehouseItem {

    // Constructor to initialize the electronics item with its name and price
    public Electronics(String name, double price) {
        super(name, price);
    }

    // Method to display information about the electronics item
    public void displayInfo() {
        System.out.println("\n===== Electronic Item =====");
        System.out.println("Name: " + name);  // Display the name of the item
        System.out.println("Price: " + price);  // Display the price of the item
    }
}
