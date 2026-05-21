package org.puralsight.model;

import org.puralsight.interfaces.identifiable;
import org.puralsight.interfaces.information;

public class Invoice implements identifiable, information {
    private long id;
    private String customerName;
    private double amount;

    public Invoice(long id, String customerName, double amount) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Invoice"
                + " | ID: "  + id
                + " | Name: " + customerName
                + " | Amount: " + amount;
    }

    @Override
    public void displayInformation() {
        System.out.println("Invoice is here");
    }
}
