package mapinterface.implementashoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add products with their prices
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.75);
        cart.addProduct("Orange", 1.25);

        // Add items to the cart
        cart.addItemToCart("Apple", 3);
        cart.addItemToCart("Banana", 5);
        cart.addItemToCart("Orange", 2);

        // Display cart in order of addition
        cart.displayCartInOrder();

        // Display cart sorted by price
        cart.displayCartSortedByPrice();

        // Remove an item from the cart
        cart.removeItemFromCart("Apple");

        // Display updated cart
        cart.displayCartInOrder();
        cart.displayCartSortedByPrice();
    }
}
