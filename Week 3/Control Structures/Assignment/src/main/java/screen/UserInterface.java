package screen;

import classes.ChoiceSelector;
import classes.character.Character;
import classes.Lifeform;
import classes.Spaceship;
import classes.character.CharacterInfo;
import classes.character.level.CharacterStats;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Character character;
    CharacterInfo characterInfo;
    Spaceship spaceship;
    Lifeform lifeform;
    ChoiceSelector choiceSelector;

    public UserInterface(Character character , ChoiceSelector choiceSelector) {
        this.character = character;
        this.choiceSelector = choiceSelector;
    }
    // function to call to display the stats of the user
    public void displayStats() {
        CharacterStats characterStats = character.getStats();
        // Display the stats
        System.out.println("Stats");
        System.out.println("========================");
        System.out.println("Rank: " + characterStats.getRank());
        System.out.println("Health: " + characterStats.getTotalHealth());
        System.out.println("Strength: " + characterStats.getTotalStrength());
        System.out.println("Defense: " + characterStats.getTotalDefense());
        System.out.println("Speed: " + characterStats.getTotalSpeed());
        System.out.println("Accuracy: " + characterStats.getTotalAccuracy());
        System.out.println("Stamina: " + characterStats.getTotalStamina());
    }
    //function to give the user time to read
    public void waitForResponse(){
        System.out.println("Press Enter to continue" );
        scanner.nextLine();
    }
    //function to display the introduction to StarBase13 and the world
    public void displayIntro(){
        // StarBase13 description and purpose
        System.out.println("Welcome to StarBase13");
        System.out.println("========================");
        System.out.println("StarBase13 is a space station");
        System.out.println("it is similar to a cities on earth.");
        System.out.println("The main difference is that there are not only humans but extra terrestrials as well.");
        System.out.println("Folks come from all over the galaxy to watch and become pro boxers.");
        System.out.println("Your destiny is to defend your planet from being destroyed");
        System.out.println("Only the bottom ten planets are devastated");
        System.out.println("There are millions of planets so your home can be saved.");
        //created a space in the terminal
        System.out.println();
        waitForResponse();
    }
    public void displayArrival(Spaceship spaceship, Lifeform lifeform1, Lifeform lifeform2,Lifeform lifeform3,Lifeform lifeform4){
        System.out.println("You arrive in a spaceship that is " + spaceship.getDescription());
        System.out.println("As you walk around you see strange things");
        System.out.println("You see aliens that have different attributes");
        System.out.println("Thinking: That one has " + lifeform1.getDescription());
        System.out.println("Thinking: That one is " + lifeform2.getDescription());
        System.out.println("Thinking: That one has a " + lifeform3.getDescription());
        System.out.println("Thinking: That one " + lifeform4.getDescription());
        waitForResponse();
    }
    //function to display text to set the user's name and passes in the life form of Quibberwibberdoodlepoop
    public void displayName(Lifeform lifeform) {
        System.out.println("Someone is calling out to you");
        // System.out.print() will do the dame as System.out.println() but will not create and use a new line
        //This will ask the user for their name
        System.out.print("???: Yo, what is your name?! ");
        //Gets the user's name and holds it in the userName string
        String userName = scanner.nextLine();
        //sets the character's name using the userName variable
        characterInfo.setUserName(userName);
        //print out the user's name
        System.out.println("Quibberwibberdoodlepoop: Hey " + userName + ", My name is Quibberwibberdoodlepoop");
        System.out.println("Quibberwibberdoodlepoop: But you can call me, Shorts");
        //displays the life form in thought
        System.out.println("Thinking: This one " + lifeform.getDescription());
    }

    //function to display text to set the user's home planet
    public void displayHomePlanet(String userName) {
        System.out.print("Quibberwibberdoodlepoop: Umm, " + userName + " what planet are your from? ");
        //Gets the user's home planet and holds it in the homePlanet string
        String homePlanet = scanner.nextLine();
        //sets the character's home planet using the homePlanet variable
        characterInfo.setHomePlanet(homePlanet);

        //Prints the user's home planet
        System.out.println("Quibberwibberdoodlepoop: Oh ok, I've heard of " + homePlanet + " before.");
    }

    //function to display text to set the user's special skill
    public void displaySkill() {
        System.out.println("Quibberwibberdoodlepoop: And by the way, what is your special skill? ");
        //Gets the user's special skill by calling a switch in the ChoiceSelector and holds it in the specialSkill string
        String specialSkill = choiceSelector.specialSkillSelector();
        //sets the character's special skill using the specialSkill variable
        characterInfo.setSpecialSkill(specialSkill);

    }
    //function to display all user's current info taking in the user's name, planet ,and skill.
    public void displayCharacterInfo(String userName,String homePlanet,String specialSkill){
        System.out.println("Quibberwibberdoodlepoop: Just so I can write in my notes, Your name is " + userName + ", You are from " + homePlanet
                + ", and your special is " + specialSkill + ".");

        System.out.println();
        System.out.println("**You are knocked out from behind**");
    }
    //function to continue the story
    public void continuePart1(Spaceship spaceship1,Spaceship spaceship2,Spaceship spaceship3,Spaceship spaceship4) {
        System.out.println();
        System.out.println("**You're waking up in a warehouse**");
        System.out.println();
        System.out.println("Thinking: Wow, dang what happened");
        System.out.println("Thinking: Those are a lot of spaceships");
        System.out.println("Thinking: The description of the ships I see goes as follows");
        //displays the spaceships descriptions
        System.out.println("Thinking: " + spaceship1.getDescription());
        System.out.println("Thinking: " + spaceship2.getDescription());
        System.out.println("Thinking: " + spaceship3.getDescription());
        System.out.println("Thinking: " + spaceship4.getDescription());
        waitForResponse();
        System.out.println("Quibberwibberdoodlepoop: Finally!!!");
        System.out.println("Quibberwibberdoodlepoop: You were asleep for weeks!");
        System.out.println("**You go back to sleep**");
    }
}
