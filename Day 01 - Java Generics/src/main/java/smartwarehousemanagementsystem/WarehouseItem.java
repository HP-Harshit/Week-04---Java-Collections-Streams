package smartwarehousemanagementsystem;

// Abstract class representing a general warehouse item
abstract public class WarehouseItem {

    String name;  // Name of the item

    double price;  // Price of the item

    // Constructor to initialize the item with its name and price
    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter method to retrieve the name of the item
    public String getName() {
        return name;
    }

    // Getter method to retrieve the price of the item
    public double getPrice() {
        return price;
    }

    // Abstract method to display information about the item, to be implemented by subclasses
    abstract public void displayInfo();
}
