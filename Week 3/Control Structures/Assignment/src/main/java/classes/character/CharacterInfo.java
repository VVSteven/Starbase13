package classes.character;

public class CharacterInfo {
    //creates the userName string variable
    private String userName;
    //creates the homePlanet string variable
    private String homePlanet;
    //creates the specialSkill string variable
    private String specialSkill;
    //creates the secretSkill string variable
    private String secretSkill;

    public CharacterInfo(String userName, String homePlanet, String specialSkill, String secretSkill) {
        this.userName = userName;
        this.homePlanet = homePlanet;
        this.specialSkill = specialSkill;
        this.secretSkill = secretSkill;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    public String getSecretSkill() {
        return secretSkill;
    }

    public void setSecretSkill(String secretSkill) {
        this.secretSkill = secretSkill;
    }
}
