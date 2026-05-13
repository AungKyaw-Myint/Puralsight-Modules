package org.puralsight.model;

public abstract class Fighter {
    private String name;
    private int powerLevel;
    private int health;

    public Fighter(String name, int powerLevel, int health) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.health = health;
    }

    abstract void specialAbility();

    public void attack() {
        System.out.println(name + " attacks with power level " + powerLevel + "!");
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage.");
        System.out.println("Health left: " + health);
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {

        return powerLevel;

    }



    public void setPowerLevel(int powerLevel) {

        this.powerLevel = powerLevel;

    }



    public int getHealth() {

        return health;

    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void useSpecialAbility() {
        // default: do nothing
    }
    public boolean isDead() {
        return health <= 0;
    }
}
