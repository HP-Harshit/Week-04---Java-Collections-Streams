package smartwarehousemanagementsystem;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {

        // Creating instances of specific items
        Electronics laptop = new Electronics("Asus Laptop", 72999.99);
        Groceries apple = new Groceries("Apple", 99.99);
        Furniture chair = new Furniture("Gaming Chair", 7999.99);

        // Creating storage for each type of item
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to their respective storage
        electronicsStorage.addItem(laptop);
        groceriesStorage.addItem(apple);
        furnitureStorage.addItem(chair);

        // Displaying all items in each storage
        Utility.displayAllItems(electronicsStorage.getItems());
        Utility.displayAllItems(groceriesStorage.getItems());
        Utility.displayAllItems(furnitureStorage.getItems());
    }
}
