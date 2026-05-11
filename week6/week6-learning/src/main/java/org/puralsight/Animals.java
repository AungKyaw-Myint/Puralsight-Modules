package org.puralsight;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {

        System.out.println("This animal is eating.");

    }



    public void makeSound() {

        System.out.println("This animal makes a sound.");

    }

    void talk() {

    }
}
