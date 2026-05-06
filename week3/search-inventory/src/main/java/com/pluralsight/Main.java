package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ProductList productList= new ProductList();

        ArrayList<Product> products= productList.fileReader();
        products.sort(Comparator.comparing(Product::getName));

        Scanner scanner= new Scanner(System.in);
        while (true){
            showMenu();
            System.out.print("Enter command: ");
            int menu = scanner.nextInt();

            switch (menu) {

                case 1:
                    for (Product p : products) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("Enter product id: ");
                    int id = scanner.nextInt();

                    for (Product p : products) {
                        if (p.getId() == id) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter min price: ");
                    double min = scanner.nextDouble();

                    System.out.print("Enter max price: ");
                    double max = scanner.nextDouble();

                    for (Product p : products) {
                        if (p.getPrice() >= min && p.getPrice() <= max) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter id: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    products.add(new Product(newId, name, price));
                    System.out.println("Product added!");
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
                    return;
            }
        }
    }

    static void showMenu(){


        System.out.println("\nWhat do you want to do?");
        System.out.println("1- List all products");
        System.out.println("2- Lookup a product by its id");
        System.out.println("3- Find all products within a price range");
        System.out.println("4- Add a new product");
        System.out.println("5- Quit the application");
    }


}
