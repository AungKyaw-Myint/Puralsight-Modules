package org.puralsight;

public class Cat extends Animals{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("Meow");
    }
}
