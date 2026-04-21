package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ProductList productList= new ProductList();

        ArrayList<Product> products= productList.fileReader();
        products.sort(Comparator.comparing(Product::getName));
        for (Product p: products){
            System.out.println(p.toString());
        }
    }


}
