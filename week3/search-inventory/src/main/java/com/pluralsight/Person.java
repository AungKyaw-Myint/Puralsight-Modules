package com.pluralsight;

public class Person {

    private String name;
    private String ph;
    private String address;

    public Person(String name, String ph, String address) {
        this.name = name;
        this.ph = ph;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ph='" + ph + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
