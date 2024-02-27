package classes;

public class Stats {
    //variables are private, so it can only be seen within this class and not be messed with outside of it
    // creates a private variable to store the health
    private int health;
    // creates a private variable to store the strength
    private int strength;
    // creates a private variable to store the strength
    private int intelligence;
    // creates a private variable to store the speed
    private int speed;
    // creates a private variable to store the luck
    private int luck;
    //constructor for creating character with health, strength, intelligence, speed, and luck attributes.
    public Stats(int health, int strength, int intelligence, int speed, int luck) {
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.luck = luck;
    }
//gets and returns the health value from the class
    public int getHealth() {
        return health;
    }
// function to change to health value and expects a number in parameter

    public void setHealth(int health) {
        this.health = health;
    }
//gets and returns the strength value from the class

    public int getStrength() {
        return strength;
    }
// function to change to strength value and expects a number in parameter

    public void setStrength(int strength) {
        this.strength = strength;
    }
//gets and returns the strength value from the class

    public int getIntelligence() {
        return intelligence;
    }
// function to change to intelligence value and expects a number in parameter

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
//gets and returns the speed value from the class

    public int getSpeed() {
        return speed;
    }
// function to change to speed value and expects a number in parameter

    public void setSpeed(int speed) {
        this.speed = speed;
    }
//gets the luck value from the class

    public int getLuck() {
        return luck;
    }
// function to change to luck value and expects a number in parameter
    public void setLuck(int luck) {
        this.luck = luck;
    }
}
