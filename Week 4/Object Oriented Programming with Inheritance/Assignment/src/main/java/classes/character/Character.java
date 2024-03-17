package classes.character;

import classes.character.level.CharacterStats;

public class Character {
    //variables are private, so it can only be seen within this class and not be messed with outside of it
    private CharacterInfo info;
    // Creates stats object to hold the character's statistics
    private CharacterStats stats;

    public Character(CharacterInfo info, CharacterStats stats) {
        this.info = info;
        this.stats = stats;
    }

    public CharacterInfo getInfo() {
        return info;
    }

    public void setInfo(CharacterInfo info) {
        this.info = info;
    }

    public CharacterStats getStats() {
        return stats;
    }

    public void setStats(CharacterStats stats) {
        this.stats = stats;
    }
}
