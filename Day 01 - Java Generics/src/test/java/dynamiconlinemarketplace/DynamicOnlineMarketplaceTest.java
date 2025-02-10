package dynamiconlinemarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicOnlineMarketplaceTest {

    // Instances of categories for testing
    BookCategory bookCategory = new BookCategory();
    ClothingCategory clothingCategory = new ClothingCategory();
    GadgetCategory gadgetCategory = new GadgetCategory();

    // Test for the Books class
    @Test
    void testBooks() {
        // Create an instance of Books
        Books javaFundamental = new Books(bookCategory, "Java Fundamental", 199.99);

        // Verify that the name and price are correctly set
        assertEquals("Java Fundamental", javaFundamental.getName());
        assertEquals(199.99, javaFundamental.getPrice());

        // Display information about the book
        javaFundamental.displayInfo();
    }

    // Test for the Cloths class
    @Test
    void testCloths() {
        // Create an instance of Cloths
        Cloths blazer = new Cloths(clothingCategory, "Blazer", 2999.99);

        // Verify that the name and price are correctly set
        assertEquals("Blazer", blazer.getName());
        assertEquals(2999.99, blazer.getPrice());

        // Display information about the clothing item
        blazer.displayInfo();
    }

    // Test for the Gadgets class
    @Test
    void testGadgets() {
        // Create an instance of Gadgets
        Gadgets laptop = new Gadgets(gadgetCategory, "Laptop", 75999.99);

        // Verify that the name and price are correctly set
        assertEquals("Laptop", laptop.getName());
        assertEquals(75999.99, laptop.getPrice());

        // Display information about the gadget
        laptop.displayInfo();
    }

    // Test for the generic Product class and Utility class
    @Test
    void testApplyDiscount() {
        // Create an instance of Books
        Books javaFundamental = new Books(bookCategory, "Java Fundamental", 199.99);

        // Apply a discount to the book
        Utility.applyDiscount(javaFundamental, 10);

        // Verify that the discount is correctly applied
        assertEquals(179.991, javaFundamental.getPrice());
    }
}
