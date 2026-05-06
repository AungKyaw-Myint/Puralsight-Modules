package com.pluralsight;

import java.util.ArrayList;

public class Main2 {

    static void main() {
        ArrayList<Product> storeProducts = new ArrayList<>();



        storeProducts.add(new Product(1,"Laptop", 1000));

        storeProducts.add(new Product(2,"Mouse", 50));

        storeProducts.add(new Product(3,"Keyboard", 150));

        storeProducts.add(new Product(4,"Monitor", 300));



        System.out.println("Available store products:");

        for (Product product : storeProducts) {

            System.out.println(product);

        }



        System.out.println();

        System.out.println("================================");

        System.out.println();



        Cart cart = new Cart();



        cart.addProduct(storeProducts.get(0));

        cart.addProduct(storeProducts.get(1));

        cart.addProduct(storeProducts.get(2));



        System.out.println("Cart items:");

        for (Product product : cart.getItems()) {

            System.out.println(product);

        }



        System.out.println("------------------");

        System.out.printf("Total: $%.2f%n", cart.getTotalPrice());



        System.out.println();

        System.out.println("Item count: " + cart.getItemCount());
    }
}
