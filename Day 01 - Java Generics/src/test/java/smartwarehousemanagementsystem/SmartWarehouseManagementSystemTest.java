package smartwarehousemanagementsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SmartWarehouseManagementSystemTest {

    // Test for the Electronics class
    @Test
    void testElectronics() {
        // Create an instance of Electronics
        Electronics laptop = new Electronics("Asus Laptop", 72999.99);

        // Verify that the name and price are correctly set
        assertEquals("Asus Laptop", laptop.getName());
        assertEquals(72999.99, laptop.getPrice());

        // Display information about the electronics item
        laptop.displayInfo();
    }

    // Test for the Groceries class
    @Test
    void testGroceries() {
        // Create an instance of Groceries
        Groceries apple = new Groceries("Apple", 99.99);

        // Verify that the name and price are correctly set
        assertEquals("Apple", apple.getName());
        assertEquals(99.99, apple.getPrice());

        // Display information about the groceries item
        apple.displayInfo();
    }

    // Test for the Furniture class
    @Test
    void testFurniture() {
        // Create an instance of Furniture
        Furniture chair = new Furniture("Gaming Chair", 7999.99);

        // Verify that the name and price are correctly set
        assertEquals("Gaming Chair", chair.getName());
        assertEquals(7999.99, chair.getPrice());

        // Display information about the furniture item
        chair.displayInfo();
    }

    // Test for the Storage class
    @Test
    void testStorage() {
        // Create an instance of Storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics laptop = new Electronics("Asus Laptop", 72999.99);

        // Add the electronics item to the storage
        electronicsStorage.addItem(laptop);
        List<Electronics> electronicsItems = electronicsStorage.getItems();

        // Verify that the item is correctly added to the storage
        assertEquals(1, electronicsItems.size());
        assertEquals(laptop, electronicsItems.get(0));
    }

    // Test for the Utility class
    @Test
    void testUtility() {
        // Create instances of Storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics laptop = new Electronics("Asus Laptop", 72999.99);
        electronicsStorage.addItem(laptop);

        Storage<Groceries> groceriesStorage = new Storage<>();
        Groceries apple = new Groceries("Apple", 99.99);
        groceriesStorage.addItem(apple);

        Storage<Furniture> furnitureStorage = new Storage<>();
        Furniture chair = new Furniture("Gaming Chair", 7999.99);
        furnitureStorage.addItem(chair);

        // Display all items in each storage category
        Utility.displayAllItems(electronicsStorage.getItems());
        Utility.displayAllItems(groceriesStorage.getItems());
        Utility.displayAllItems(furnitureStorage.getItems());
    }
}
