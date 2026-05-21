package org.puralsight.model;

import org.puralsight.interfaces.identifiable;
import org.puralsight.interfaces.information;

import java.util.ArrayList;

public class Order implements identifiable, information {

    private long orderId;
    private String customerName;
    private ArrayList<LineItem> lineItems;

    public Order(long orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.lineItems = new ArrayList<>();
    }
    public void addItem(LineItem item){
        lineItems.add(item);
    }

    public double getTotal(){
        double total = 0;
        for(LineItem item: lineItems) {
            total += item.getLineTotal();
        }
        return total;
    }

    @Override
    public long getId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order" +
                " | ID: " + orderId +
                " | Customer Name: " + customerName +
                " | Total Price: $" + getTotal() +
                " | Items: " + lineItems;

    }

    @Override
    public void displayInformation() {
        System.out.println("Hello Order");
        System.out.println("Order " + orderId + " belongs to customer: " + customerName);
    }
}
