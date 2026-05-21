package org.puralsight.ui;

import org.puralsight.interfaces.identifiable;
import org.puralsight.model.Customer;
import org.puralsight.model.Invoice;
import org.puralsight.model.Order;
import org.puralsight.model.LineItem;
import org.puralsight.model.Product;

import java.util.ArrayList;

public class Program {

    public Program() {
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();
        ArrayList<Invoice> invoices = new ArrayList<>();


        products.add(new Product(1L, "product1", 11.11));
        products.add(new Product(2L, "product2", 21.22));
        products.add(new Product(3L, "product3", 23.33));

        customers.add(new Customer(1L, "Customer1"));
        customers.add(new Customer(2L, "Customer2"));
        customers.add(new Customer(3L, "Customer3"));

//        orders.add(new Order(1L, 30.00, products));
//        orders.add(new Order(2L, 20.00, products));
//        orders.add(new Order(3L, 10.00, products));

        Order order1 = new Order(1L, "Aung");
        order1.addItem(new LineItem(1L, "PS5", 100.00, 2));
        order1.addItem(new LineItem(2L, "House", 900000, 1));
        orders.add(order1);

        Order order2 = new Order(1L, "Sebly");
        order2.addItem(new LineItem(1L, "Cyber Truck", 100000, 2));
        order2.addItem(new LineItem(2L, "iPhone 17 Pro Max", 1300, 5));
        orders.add(order2);

        invoices.add(new Invoice(1L, "Goku", 200.00));
        invoices.add(new Invoice(2L, "Sebly", 1000.00));
        invoices.add(new Invoice(3L, "Junyong", 1200.00));

        System.out.println("=== Products ===");
        printList(products);

        System.out.println();
        System.out.println("=== Customers ===");
        printList(customers);

        System.out.println();
        System.out.println("=== Orders ===");
        printList(orders);

        System.out.println();
        System.out.println("=== Invoices ===");
        printList(invoices);

        Product foundProduct = findById(products, 2L);
        Customer foundCustomer = findById(customers, 3L);
        Order foundOrder = findById(orders, 1L);
        Invoice foundInvoice = findById(invoices, 2L);

        System.out.println();
        System.out.println("=== Search Results ===");
        System.out.println("Found product: " + foundProduct);
        System.out.println("Found customer: " + foundCustomer);
        System.out.println("Found order: " + foundOrder);
        System.out.println("Found invoice: " + foundInvoice);


        System.out.println();
        System.out.println("=== Impulsive Orders ===");
        ArrayList<Order> impluseOrders = findImpluseOrders(orders,25);
        printList(impluseOrders);

        System.out.println();
        System.out.println("=== Total Sales ===");
        double salesTotal = getTotalSales(orders);
        System.out.printf("$%,.2f%n", salesTotal);
    }

    public <T> void printList(ArrayList<T> items) {
        if (items.isEmpty()) {
            System.out.println("No items found.");
            return;
        }
        for (T item : items) {
            System.out.println(item);
            System.out.println();
        }
    }

    public <T extends identifiable> T findById(ArrayList<T> items, long id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Order> findImpluseOrders(ArrayList<Order> orders, double amount) {
        ArrayList<Order> impluseOrders = new ArrayList<>();
        for (Order order : orders) {
            if (order.getTotal() > amount) {
                impluseOrders.add(order);
            }
        }
        return impluseOrders;
    }

    public double getTotalSales(ArrayList<Order> orders) {
        double totalSales = 0;
        for (Order order : orders) {
            totalSales += order.getTotal();
        }
        return totalSales;
    }
}




