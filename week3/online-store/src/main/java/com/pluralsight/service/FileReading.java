package com.pluralsight.service;

import com.pluralsight.model.Product;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReading {

    List<Product> products = new ArrayList<>();

    public List<Product> fileReader(){
        try {
            File file = new File("/C:/pluralsight/Puralsight-Modules/week3/online-store/src/main/resources/products.csv");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                Product product= new Product();

                String[] parts = line.split("\\|");

                product.setId(parts[0]);
                product.setName(parts[1]);
                product.setPrice(Double.parseDouble(parts[2]));
                product.setDepartment(parts[3]);

                products.add(product);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }
}
