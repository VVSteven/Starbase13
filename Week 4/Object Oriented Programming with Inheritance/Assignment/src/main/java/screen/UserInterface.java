package screen;

import classes.BoxingRing;
import classes.character.Character;
import classes.lifeform.Lifeform;
import classes.Spaceship;
import classes.character.CharacterInfo;
import classes.character.level.CharacterStats;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Character character;
    CharacterInfo characterInfo;
    Spaceship spaceship;
    BoxingRing boxingRing;
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
    //function to display characters information
    public void displayCharacterInfo() {
        CharacterInfo characterInfo = character.getInfo();
        // Display the stats
        System.out.println("Information");
        System.out.println("========================");
        System.out.println("Name: " + characterInfo.getUserName());
        System.out.println("Lifeform: " + characterInfo.getLifeform());
        System.out.println("Nationality/Species: " + characterInfo.getNationalityOrSpecies());
        System.out.println("Home Planet: " + characterInfo.getHomePlanet());
        System.out.println("Special Skill: " + characterInfo.getSpecialSkill());
//        System.out.println("Accuracy: " + characterInfo.getSecretSkill());
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
    public void enterCharacterInfo(){
        System.out.println("Enter Your Name...");
        //Gets the user's name and holds it in the userName string
        String userName = scanner.nextLine();
        //sets the character's name using the userName variable
        character.getInfo().setUserName(userName);
        System.out.println("Enter Your Home Planet...");
        String homePlanet = scanner.nextLine();
        character.getInfo().setHomePlanet(homePlanet);
        character.getInfo().setSpecialSkill("N/A");

    }
    public void displayIntroPart2(){
        CharacterInfo characterInfo = character.getInfo();
        String lifeform = choiceSelector.lifeformSelector();
        characterInfo.setLifeform(lifeform);

        if (lifeform.equals("Human")){
            String nationality = choiceSelector.nationalitySelector();
            characterInfo.setNationalityOrSpecies(nationality);
        }
        else{
            String species = choiceSelector.speciesSelector();
            characterInfo.setNationalityOrSpecies(species);
        }
        waitForResponse();
    }

    public void displayArrival(Spaceship spaceship){
        System.out.println("You arrive in a spaceship that is " + spaceship.getDescription());
        System.out.println("As you walk around you see strange things");
        waitForResponse();
    }
    //function to display text to set the user's name and passes in the life form of Quibberwibberdoodlepoop
    public void displayName(Lifeform lifeform) {
        System.out.println("Someone is calling out to you");
        // System.out.print() will do the dame as System.out.println() but will not create and use a new line
        //This will ask the user for their name
        System.out.println("???: Yo, what is your name?! ");
        System.out.println(character.getInfo().getUserName() +": My name is "+character.getInfo().getUserName() +" ");
        //print out the user's name
        System.out.println("Quibberwibberdoodlepoop: Hey " + character.getInfo().getUserName()  + ", My name is Quibberwibberdoodlepoop");
        System.out.println("Quibberwibberdoodlepoop: But you can call me, Shorts");
        //displays the life form in thought
        System.out.println("Thinking: This one " + lifeform.getDescription());
    }

    //function to display text to set the user's home planet
    public void displayHomePlanet() {
        System.out.print("Quibberwibberdoodlepoop: Umm, " + character.getInfo().getUserName() + " what planet are your from? ");
        System.out.println(character.getInfo().getUserName() +": I am from "+ character.getInfo().getHomePlanet());
        //Prints the user's home planet
        System.out.println("Quibberwibberdoodlepoop: Oh ok, I've heard of " + character.getInfo().getHomePlanet() + " before.");
    }

    //function to display text to set the user's special skill
    public void displaySkill() {
        System.out.println("Quibberwibberdoodlepoop: And by the way, what is your special skill? ");
        //Gets the user's special skill by calling a switch in the ChoiceSelector and holds it in the specialSkill string
        String specialSkill = choiceSelector.specialSkillSelector();
        //sets the character's special skill using the specialSkill variable
        character.getInfo().setSpecialSkill(specialSkill);

    }
    //function to display all user's current info taking in the user's name, planet ,and skill.
    public void displayQuibberwibberdoodlepoopPlan(String userName,String homePlanet,String specialSkill){
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
    public void continuePart2(){
        System.out.println();
        System.out.println("**You're waking up in a warehouse again but now drenched in water**");
        System.out.println("Quibberwibberdoodlepoop: Now that you are awake.");
        System.out.println("Quibberwibberdoodlepoop: I will tell you what I am planing.");
        System.out.println("Quibberwibberdoodlepoop: I am going to coach and you will now fight for me.");
        System.out.println("Quibberwibberdoodlepoop: Do you agree?");
        String response = choiceSelector.joinQuibberwibberdoodlepoop();
        System.out.println("Quibberwibberdoodlepoop: " + response);
        waitForResponse();
    }
    public void enterQuibberwibberdoodlepoopDoor(){
        System.out.println();
        System.out.println("Quibberwibberdoodlepoop: oh yea lets see if you have good memory");
        System.out.println("Quibberwibberdoodlepoop: Unlock the door to my room");
        choiceSelector.unlockDoor();
        System.out.println("Quibberwibberdoodlepoop: Alright you got lets go");
        waitForResponse();
    }
    public void fightQuibberwibberdoodlepoop(BoxingRing quibberwibberdoodlepoopRoom){
        System.out.println("**Quibberwibberdoodlepoop takes you to a room**");
        System.out.println("**" + quibberwibberdoodlepoopRoom.getDescription() + "**");
        System.out.println("Quibberwibberdoodlepoop: Lets fight");
        System.out.println(character.getInfo().getUserName() + ": Lets fight");
        System.out.println("**Quibberwibberdoodlepoop beats you up and there is no way you could have one**");
        waitForResponse();
    }
    public void fightOpponent1(Lifeform lifeform,BoxingRing room1){
        System.out.println("**Quibberwibberdoodlepoop helps you up**");
        System.out.println("Quibberwibberdoodlepoop: To begin your training we must fight other opponents");
        System.out.println(character.getInfo().getUserName() +": Ok lets begin");
        System.out.println("**You Enter a new room**");
        System.out.println("**" + room1.getDescription() + "**");
        System.out.println(lifeform.getName() + ": Lets fight");
        System.out.println(character.getInfo().getUserName() + ": Lets fight");
        System.out.println("**You exchange blows fiercely, but in the end, you emerge victorious! against "+lifeform.getName()+"**");
        System.out.println("Quibberwibberdoodlepoop: Wow, good job I knew you could win");
        waitForResponse();
    }

    public void fightOpponent2(Lifeform lifeform,BoxingRing room2){
        System.out.println("**Quibberwibberdoodlepoop takes you to a room**");
        System.out.println("**" + room2.getDescription() + "**");
        System.out.println("Quibberwibberdoodlepoop: These next fights are going to be a bit tougher");
        System.out.println(lifeform.getName()+": Lets fight");
        System.out.println(character.getInfo().getUserName() + ": Lets fight");
        System.out.println("**You struggle against your opponent's might, but your determination prevails, and you win against "+lifeform.getName()+"**");
        waitForResponse();

    }

    public void fightOpponent3(Lifeform lifeform,BoxingRing room3){
        System.out.println("**Quibberwibberdoodlepoop takes you new room to a room**");
        System.out.println("**" + room3.getDescription() + "**");
        System.out.println(lifeform.getName() + ": Lets fight");
        System.out.println(character.getInfo().getUserName() + ": Lets fight");
        System.out.println("**Despite the odds, you manage to out punch " + lifeform.getName()+ " and claim victory!**");
        waitForResponse();

    }

    public void fightOpponent4(Lifeform lifeform,BoxingRing room4){
        System.out.println("**Quibberwibberdoodlepoop takes to the final fight room**");
        System.out.println("**" + room4.getDescription() + "**");
        System.out.println(lifeform.getName() + ": Lets fight");
        System.out.println(character.getInfo().getUserName() + ": Lets fight");
        System.out.println("**You face your opponent head-on, and with skill and determination, emerge as the winner!**");
        waitForResponse();

    }
    public void continuePart3(){
        System.out.println("Quibberwibberdoodlepoop: Good job beating those guys");
        System.out.println("Quibberwibberdoodlepoop: Now go rest");
        System.out.println("**You go back to the chair and sleep**");
    }
}
