package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductList {

    private ArrayList<Product> products= new ArrayList<>();

    public ArrayList<Product> fileReader(){
        try {
            File file = new File("/C:/pluralsight/Puralsight-Modules/week3/search-inventory/src/main/resources/inventory.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                Product product=new Product();

                String[] parts = line.split("\\|");

                product.setId(Integer.parseInt(parts[0]));
                product.setName(parts[1]);
                product.setPrice(Double.parseDouble(parts[2]));

                products.add(product);
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
}
