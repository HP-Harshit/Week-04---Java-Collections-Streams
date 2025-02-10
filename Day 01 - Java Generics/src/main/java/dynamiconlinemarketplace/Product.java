package dynamiconlinemarketplace;

// Class representing a category for books
class BookCategory {}

// Class representing a category for clothing
class ClothingCategory {}

// Class representing a category for gadgets
class GadgetCategory {}

// Abstract class representing a general product with a type parameter T for the category
abstract class Product<T> {

    T category;  // Category of the product
    String name;  // Name of the product
    double price;  // Price of the product

    // Constructor to initialize the product with its category, name, and price
    public Product(T category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    // Getter method to retrieve the category of the product
    public T getCategory() {
        return category;
    }

    // Getter method to retrieve the name of the product
    public String getName() {
        return name;
    }

    // Getter method to retrieve the price of the product
    public double getPrice() {
        return price;
    }

    // Setter method to update the price of the product
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to display information about the product, to be implemented by subclasses
    abstract public void displayInfo();
}
