package org.puralsight.model;

import org.puralsight.interfaces.identifiable;

public class Customer implements identifiable {
    private Long customerId;
    private String customerName;

    public Customer(Long customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    @Override
    public long getId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer" +
                " | ID: " + customerId +
                " | Name: " + customerName;
    }
}
