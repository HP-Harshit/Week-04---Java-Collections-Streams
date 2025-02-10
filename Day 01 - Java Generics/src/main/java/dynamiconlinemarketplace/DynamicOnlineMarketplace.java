package dynamiconlinemarketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {

        // Creating instances of specific categories
        BookCategory book = new BookCategory();
        ClothingCategory cloth = new ClothingCategory();
        GadgetCategory gadgets = new GadgetCategory();

        // Creating instances of specific products with their respective categories, names, and prices
        Books javaFundamental = new Books(book, "Java Fundamental", 199.99);
        Cloths blazer = new Cloths(cloth, "Blazer", 2999.99);
        Gadgets laptop = new Gadgets(gadgets, "Laptop", 75999.99);

        // Applying discounts to the products
        Utility.applyDiscount(javaFundamental, 8);
        Utility.applyDiscount(blazer, 10);
        Utility.applyDiscount(laptop, 13);

        // Displaying information about the products
        javaFundamental.displayInfo();
        blazer.displayInfo();
        laptop.displayInfo();
    }
}
