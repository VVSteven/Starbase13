package classes.lifeform;

import classes.character.level.CharacterStats;

public class Human extends Lifeform{
    private String nationality;
    public Human(String name, CharacterStats stats, String description) {
        super(name, stats, description);
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
