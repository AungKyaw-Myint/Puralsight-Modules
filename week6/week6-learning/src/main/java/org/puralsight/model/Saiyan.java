package org.puralsight.model;

public class Saiyan extends Fighter {



    public Saiyan(String name, int powerLevel, int health) {

        super(name, powerLevel, health);

    }

    @Override
    void specialAbility() {
        System.out.println(this.getName()+" special ability.");
    }


    public void transform() {

        int newPowerLevel = getPowerLevel() * 2;

        setPowerLevel(newPowerLevel);



        System.out.println(getName() + " transforms into Super Saiyan!");

        System.out.println("New power level: " + getPowerLevel());

    }


    @Override
    public void useSpecialAbility() {
        transform();
    }
}
