package org.puralsight;

public class Dog extends Animals{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void talk() {
        System.out.println("Woef Woef");
    }
}
