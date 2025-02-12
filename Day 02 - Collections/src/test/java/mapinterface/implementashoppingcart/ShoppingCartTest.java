package mapinterface.implementashoppingcart;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    @Test
    void testAddProductAndAddItemToCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.75);

        cart.addItemToCart("Apple", 2);
        cart.addItemToCart("Banana", 3);

        // Check if the items were added correctly
        cart.displayCartInOrder();
        cart.displayCartSortedByPrice();
    }

    @Test
    void testRemoveItemFromCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.75);

        cart.addItemToCart("Apple", 2);
        cart.addItemToCart("Banana", 3);

        // Remove an item from the cart
        cart.removeItemFromCart("Apple");

        // Check if the item was removed correctly
        cart.displayCartInOrder();
        cart.displayCartSortedByPrice();
    }

    @Test
    void testDisplayCartInOrder() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.75);
        cart.addProduct("Orange", 1.25);

        cart.addItemToCart("Apple", 3);
        cart.addItemToCart("Banana", 5);
        cart.addItemToCart("Orange", 2);

        // Check the display order
        cart.displayCartInOrder();
    }

    @Test
    void testDisplayCartSortedByPrice() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.75);
        cart.addProduct("Orange", 1.25);

        cart.addItemToCart("Apple", 3);
        cart.addItemToCart("Banana", 5);
        cart.addItemToCart("Orange", 2);

        // Check the sorted display
        cart.displayCartSortedByPrice();
    }
}
