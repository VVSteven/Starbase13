package screen;

import classes.Character;
import classes.Lifeform;
import classes.Spaceship;
import classes.Stats;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Character character;
    Spaceship spaceship;
    Lifeform lifeform;

    public UserInterface(Character character) {
        this.character = character;
    }
    // function to call to display the stats of the user at any moment
    public void displayStats() {
        //gets the stats for the character and stores it in the stats variable
        Stats stats = character.getStats();
        //display the stats by getting them from the stats class and calling the methods
        System.out.println("Stats");
        System.out.println("========================");
        System.out.println("Health: " + stats.getHealth());
        System.out.println("Strength: " + stats.getStrength());
        System.out.println("Intelligence: " + stats.getIntelligence());
        System.out.println("Speed: " + stats.getSpeed());
        System.out.println("Luck: " + stats.getLuck());

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
    }
    public void displayArrival(Spaceship spaceship, Lifeform lifeform1, Lifeform lifeform2,Lifeform lifeform3,Lifeform lifeform4){
        System.out.println("You arrived in a spaceship that is " + spaceship.getDescription());
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
        character.setUserName(userName);
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
        character.setHomePlanet(homePlanet);

        //Prints the user's home planet
        System.out.println("Quibberwibberdoodlepoop: Oh ok, I've heard of " + homePlanet + " before.");
    }

    //function to display text to set the user's special skill
    public void displaySkill() {
        System.out.print("Quibberwibberdoodlepoop: And by the way, what is your special skill? ");
        //Gets the user's special skill holds it in the specialSkill string
        String specialSkill = scanner.nextLine();
        //sets the character's special skill using the specialSkill variable
        character.setSpecialSkill(specialSkill);

    }
    //function to display all user's current info taking in the user's name, planet ,and skill.
    public void displayCharacterInfo(String userName,String homePlanet,String specialSkill){
        System.out.println("Quibberwibberdoodlepoop: Just so I can write in my notes, Your name is " + userName + ", You are from " + homePlanet
                + ", and your special is " + specialSkill + ".");

        System.out.println();
        System.out.println("**You are knocked out from behind**");
        System.out.println();
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
