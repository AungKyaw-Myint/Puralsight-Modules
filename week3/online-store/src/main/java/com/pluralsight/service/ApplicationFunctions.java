package com.pluralsight.service;

import com.pluralsight.model.Cart;
import com.pluralsight.model.Product;

import java.util.List;
import java.util.Scanner;

public class ApplicationFunctions {

    Cart cart= new Cart();

    public void appFunction(){
        Scanner sc= new Scanner(System.in);

        boolean flag= true;

        while (flag) {
            displayMenu();
            System.out.print("Choose the menu :");
            String option = sc.nextLine();
            switch (option) {
                case "P":
                    FileReading fileReading = new FileReading();
                    List<Product> productList = fileReading.fileReader();

                    for (Product p : productList) {
                        System.out.println(p);
                    }
                    break;
                case "D":
                    cart.getItems();
                    break;
                case "E":
                    flag=false;
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }

    public void displayMenu(){
        System.out.println("(P) Display Product");
        System.out.println("(D) Display Cart");
        System.out.println("(E) Exit");
    }
}
