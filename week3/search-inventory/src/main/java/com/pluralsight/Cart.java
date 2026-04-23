package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Cart {


    // TODO 1: Create a private list that stores Product objects
    // Hint: Use List<Product> and ArrayList
    private List<Product> items = new ArrayList<>();

    /**
     * Adds a product to the cart.
     */
    public void addProduct(Product product) {

        // TODO 2: Check if the product is null
        // If null → throw IllegalArgumentException

        // TODO 3: Add the product to the list
        if(product != null){
            items.add(product);
        }else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Removes a product from the cart.
     */
    public void removeProduct(Product product) {

        // TODO 4: Remove the product from the list
        items.remove(product);
    }

    /**
     * Returns all products in the cart.
     */
    public List<Product> getItems() {

        // TODO 5: Return a read-only version of the list
        // Hint: Collections.unmodifiableList(...)
        return items;
    }

    /**
     * Returns the number of items in the cart.
     */
    public int getItemCount() {

        // TODO 6: Return the size of the list
        return items.size();
    }

    /**
     * Checks whether the cart is empty.
     */
    public boolean isEmpty() {

        // TODO 7: Return true if the cart is empty
        return items.isEmpty();
    }

    /**
     * Removes all products from the cart.
     */
    public void clear() {

        // TODO 8: Clear the list
        items.clear();
    }

    /**
     * Calculates the total price.
     */
    public double getTotalPrice() {

        // TODO 9: Create a variable to store the total (double total = 0;)

        // TODO 10: Loop over all products (for-each loop)

        // TODO 11: Add each product price to total
        // Hint: product.getPrice()

        // TODO 12: Return the total

        double total=0;
        for(Product p: items){
            total+=p.getPrice();
        }
        return total;
    }

    /**
     * (Optional Bonus)
     * Prints all products in the cart.
     */
    public void printItems() {

        // TODO 13: Loop through all products

        // TODO 14: Print each product
        // Hint: System.out.println(product);
        for(Product p: items){
            System.out.println(p);
        }
    }
}
