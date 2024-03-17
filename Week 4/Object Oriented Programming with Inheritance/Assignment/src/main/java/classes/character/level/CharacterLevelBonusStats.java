package classes.character.level;

public class CharacterLevelBonusStats {

    private int characterRank;
    private int bonusHealth;
    // creates a private variable to store the strength
    private double bonusStrength;
    // creates a private variable to store the strength
    private double bonusDefense;
    // creates a private variable to store the speed
    private double bonusSpeed;
    // creates a private variable to store the luck
    private double bonusAccuracy;
    // creates a private variable to store the stamina
    private int bonusStamina;

    public CharacterLevelBonusStats(int characterRank, int bonusHealth, double bonusStrength, double bonusDefense, double bonusSpeed, double bonusAccuracy, int bonusStamina) {
        this.characterRank = characterRank;
        this.bonusHealth = bonusHealth;
        this.bonusStrength = bonusStrength;
        this.bonusDefense = bonusDefense;
        this.bonusSpeed = bonusSpeed;
        this.bonusAccuracy = bonusAccuracy;
        this.bonusStamina = bonusStamina;
    }
    public int getBonusHealth() {
        return bonusHealth;
    }

    public double getBonusStrength() {
        return bonusStrength;
    }

    public double getBonusDefense() {
        return bonusDefense;
    }

    public double getBonusSpeed() {
        return bonusSpeed;
    }

    public double getBonusAccuracy() {
        return bonusAccuracy;
    }

    public int getBonusStamina() {
        return bonusStamina;
    }
}
