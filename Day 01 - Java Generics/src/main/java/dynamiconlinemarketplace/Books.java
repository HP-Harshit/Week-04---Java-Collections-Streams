package dynamiconlinemarketplace;

// Class representing a Books product that extends the Product class with BookCategory as the type parameter
public class Books extends Product<BookCategory> {

    // Constructor to initialize the Books product with its category, name, and price
    public Books(BookCategory category, String name, double price) {
        super(category, name, price);
    }

    // Method to display information about the Books product
    @Override
    public void displayInfo() {
        System.out.println("Book: " + getName() + ", Price: " + getPrice());  // Display the name and price of the book
    }
}
