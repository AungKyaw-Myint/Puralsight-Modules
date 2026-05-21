package org.puralsight.model;

import org.puralsight.interfaces.identifiable;

public class Product implements identifiable {

    private long productId;
    private String productName;
    private double productPrice;

    public Product(long productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public long getId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product"
                + " | ID: " + productId
                + " | Name: " + productName
                + " | Price: $" + productPrice;
    }
}
