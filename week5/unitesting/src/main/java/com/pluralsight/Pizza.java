package com.pluralsight;

public class Pizza {

    private double price;
    private String name;

    public Pizza(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double calculatePrice(boolean extraCheese, boolean yearUpCode){
        double result=price;
        if(extraCheese){
            result+=2;
        }
        if(yearUpCode){
            result *= 0.9;
        }

        return result;
    }
}
