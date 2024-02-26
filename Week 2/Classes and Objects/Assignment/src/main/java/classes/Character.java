package classes;

public class Character {
    //variables are private, so it can only be seen within this class and not be messed with outside of it
    //creates the userName string variable
    private String userName;
    //creates the homePlanet string variable
    private String homePlanet;
    //creates the specialSkill string variable
    private String specialSkill;
    //creates the secretSkill string variable
    private String secretSkill;
    //creates the  userFear string variable
    private String userFear;
    // Creates variable to hold the character's statistics
    private Stats stats;

    //constructor for creating character with userName,homePlanet, specialSkill, secretSkill, userFear,and stats attributes.
    public Character(String userName, String homePlanet, String specialSkill, String secretSkill, String userFear, Stats stats) {
        //this is used to access this  class and change the value to the ones in the parameters
        this.userName = userName;
        this.homePlanet = homePlanet;
        this.specialSkill = specialSkill;
        this.secretSkill = secretSkill;
        this.userFear = userFear;
        this.stats = stats;
    }


    //Getter method for retrieving the user's name.

    public String getUserName() {
        return userName;
    }


    //       Setter method for setting the user's name.
    public void setUserName(String userName) {
        this.userName = userName;
    }

    //Getter method for retrieving the user's home planet.
    public String getHomePlanet() {
        return homePlanet;
    }

    //Setter method for setting the user's home planet.

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    //Getter method for retrieving the user's special skill.
    public String getSpecialSkill() {
        return specialSkill;
    }

    //Setter method for setting the user's special skill.

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    // Getter method for retrieving the user's secret skill.
    public String getSecretSkill() {
        return secretSkill;
    }

    // Setter method for setting the user's secret skill.
    public void setSecretSkill(String secretSkill) {
        this.secretSkill = secretSkill;
    }

    // Getter method for retrieving the user's fear.
    public String getUserfear() {
        return userFear;
    }

    //Setter method for setting the user's fear.

    public void setUserFear(String userFear) {
        this.userFear = userFear;
    }

    // Getter method for retrieving the user's stats.
    public Stats getStats() {
        return stats;
    }

    //Setter method for setting the user's stats.
    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
