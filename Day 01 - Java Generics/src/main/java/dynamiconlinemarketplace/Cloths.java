package dynamiconlinemarketplace;

// Class representing a Cloths product that extends the Product class with ClothingCategory as the type parameter
public class Cloths extends Product<ClothingCategory> {

    // Constructor to initialize the Cloths product with its category, name, and price
    public Cloths(ClothingCategory category, String name, double price) {
        super(category, name, price);
    }

    // Method to display information about the Cloths product
    @Override
    public void displayInfo() {
        System.out.println("Cloth: " + getName() + ", Price: " + getPrice());  // Display the name and price of the cloth
    }
}
