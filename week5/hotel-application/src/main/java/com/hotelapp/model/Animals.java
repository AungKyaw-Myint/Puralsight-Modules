package com.hotelapp.model;

public class Animals {

    private String name;
    private String color;
    private int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void play() {
        System.out.println(name + " is playing.");
    }
}
