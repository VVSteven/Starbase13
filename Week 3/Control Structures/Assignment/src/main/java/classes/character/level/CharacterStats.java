package classes.character.level;

public class CharacterStats {
    private CharacterLevelBonusStats characterLevelBonusStats;
    private int rank;
    private final int baseHealth;
    private final double baseStrength;
    private final double baseDefense;
    private final double baseSpeed;
    private final double baseAccuracy;
    private final int baseStamina;

    public CharacterStats(int rank) {
        this.rank = rank;
        this.baseHealth = 100;
        this.baseStrength = 10.0;
        this.baseDefense = 5.0;
        this.baseSpeed = 5.0;
        this.baseAccuracy = 5.0;
        this.baseStamina = 50;
        this.characterLevelBonusStats = new CharacterLevelBonusStats(rank,0,0,0,0,0,0);
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getTotalHealth() {
        return baseHealth + characterLevelBonusStats.getBonusHealth();
    }

    public double getTotalStrength() {
        return baseStrength + characterLevelBonusStats.getBonusStrength();
    }

    public double getTotalDefense() {
        return baseDefense + characterLevelBonusStats.getBonusDefense();
    }

    public double getTotalSpeed() {
        return baseSpeed + characterLevelBonusStats.getBonusSpeed();
    }

    public double getTotalAccuracy() {
        return baseAccuracy + characterLevelBonusStats.getBonusAccuracy();
    }

    public int getTotalStamina() {
        return baseStamina + characterLevelBonusStats.getBonusStamina();
    }
}
