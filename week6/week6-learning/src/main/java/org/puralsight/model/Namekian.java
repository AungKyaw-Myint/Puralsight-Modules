package org.puralsight.model;

public class Namekian extends Fighter{

    public Namekian(String name, int powerLevel, int health) {
        super(name, powerLevel, health);
    }

    public void regenerate() {

        int newHealthLevel = getHealth() * 2;

        setHealth(newHealthLevel);



        System.out.println(getName() + " regenerate!");

        System.out.println("New health level: " + getHealth());

    }

    @Override
    public void useSpecialAbility() {
        regenerate();
    }
}
