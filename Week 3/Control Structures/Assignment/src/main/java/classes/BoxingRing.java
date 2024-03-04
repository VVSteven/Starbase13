package classes;

import classes.character.Character;

public class BoxingRing {
    Character character;
    Lifeform opponent;
    String description;

    public BoxingRing(Character character, Lifeform opponent, String description) {
        this.character = character;
        this.opponent = opponent;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
