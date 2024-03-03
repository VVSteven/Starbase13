package classes;

import classes.character.level.CharacterStats;

public class Lifeform {
    //creates a description variable
    private String description;
    //Craea
    private CharacterStats stats;
    //constructor to create life form with a description

    public Lifeform(String description) {
        this.description = description;
    }
    //function to get the spaceship description

    public String getDescription() {
        return description;
    }

}

