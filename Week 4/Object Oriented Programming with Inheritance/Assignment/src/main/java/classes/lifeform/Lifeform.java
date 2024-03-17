package classes.lifeform;

import classes.character.level.CharacterStats;

public class Lifeform {
    private String name;
    private CharacterStats stats;
    //creates a description variable
    private String description;
    //constructor to create life form with a description

    public Lifeform(String name, CharacterStats stats, String description) {
        this.name = name;
        this.stats = stats;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public CharacterStats getStats() {
        return stats;
    }

    public String getDescription() {
        return description;
    }
}

