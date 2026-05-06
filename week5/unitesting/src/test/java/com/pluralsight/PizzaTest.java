package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @org.junit.jupiter.api.Test
    void addExtraChess_callCalculatePrice_resultInPrice() {

        Pizza pizza=new Pizza(11,"Cheese Pizza");
        double result=pizza.calculatePrice(true,false);

        assertEquals(result, 13);
    }
}