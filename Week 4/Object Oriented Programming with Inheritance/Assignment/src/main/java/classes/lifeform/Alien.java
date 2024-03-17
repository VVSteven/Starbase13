package classes.lifeform;

import classes.character.level.CharacterStats;

public class Alien extends Lifeform{
    private String species;
    public Alien(String name, CharacterStats stats, String description) {
        super(name, stats, description);
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
