package mapinterface.implementashoppingcart;

import java.util.*;

public class ShoppingCart {
    // HashMap to store product prices
    private Map<String, Double> productPrices = new HashMap<>();

    // LinkedHashMap to maintain the order of items added
    private Map<String, Integer> cart = new LinkedHashMap<>();

    // TreeMap to display items sorted by price
    private Map<Double, List<String>> sortedCart = new TreeMap<>();

    // Method to add a product with its price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Method to add an item to the cart
    public void addItemToCart(String product, int quantity) {
        if (!productPrices.containsKey(product)) {
            System.out.println("Product not found!");
            return;
        }

        // Add or update the quantity in the cart
        cart.put(product, cart.getOrDefault(product, 0) + quantity);

        // Update the sortedCart
        double price = productPrices.get(product);
        sortedCart.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
    }

    // Method to remove an item from the cart
    public void removeItemFromCart(String product) {
        if (!cart.containsKey(product)) {
            System.out.println("Product not in the cart!");
            return;
        }

        int quantity = cart.get(product);
        if (quantity == 1) {
            cart.remove(product);
        } else {
            cart.put(product, quantity - 1);
        }

        // Update the sortedCart
        double price = productPrices.get(product);
        List<String> products = sortedCart.get(price);
        products.remove(product);
        if (products.isEmpty()) {
            sortedCart.remove(price);
        }
    }

    // Method to display items in the cart in the order they were added
    public void displayCartInOrder() {
        System.out.println("Cart (in order of addition):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to display items in the cart sorted by price
    public void displayCartSortedByPrice() {
        System.out.println("Cart (sorted by price):");
        for (Map.Entry<Double, List<String>> entry : sortedCart.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + ": " + entry.getKey());
            }
        }
    }
}
