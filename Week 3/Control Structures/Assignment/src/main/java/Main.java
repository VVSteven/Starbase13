// imports the character class to create a character and use the methods form the class

import classes.ChoiceSelector;
import classes.character.Character;
// imports the stats class to be able to update and keep track of the character's stats
import classes.character.CharacterInfo;
import classes.character.level.CharacterStats;
import classes.Lifeform;
import classes.Spaceship;
// imports the user interface from the screen folder using "*" symbol (which means all)
// and now able to use the methods in the UserInterface class
import screen.*;

// creates a class called Main to match the name of the java file
public class Main {
    //public means that this can be called from anywhere
    public static void main(String[] args) {
        CharacterInfo characterInfo = new CharacterInfo(" "," ", " "," ");
        // creates the stats at the start to be used throughout.
        CharacterStats characterStats = new CharacterStats(1);
        //Creates a new character taking in empty parameters as of now but will be updated later
        Character mainCharacter = new Character(characterInfo, characterStats);
        // Create a ChoiceSelector
        ChoiceSelector choiceSelector = new ChoiceSelector();
        //Passing in the character to the user interface to only work on character that was just created
        UserInterface ui = new UserInterface(mainCharacter, choiceSelector);
        //creates ships with different descriptions / characteristics
        Spaceship ship1 = new Spaceship("Small cargo ship with blue stripes and yellow flames.");
        Spaceship ship2 = new Spaceship("An absolute speed demon with rockets everywhere");
        Spaceship ship3 = new Spaceship("Looks like the Millennium Falcon but tiny");
        Spaceship ship4 = new Spaceship("Can turn invisible and is super slow");
        Spaceship ship5 = new Spaceship("in the shape of a donut");
        //creates alien with different descriptions / characteristics
        //A special "alien"
        Lifeform Quibberwibberdoodlepoop = new Lifeform("Looks like Squidward");
        Lifeform alien1 = new Lifeform("Huge eye but small body");
        Lifeform alien2 = new Lifeform("Spikey and slimey");
        Lifeform alien3 = new Lifeform("Huge body but small eye");
        Lifeform alien4 = new Lifeform("Looks human");

        ui.displayStats();
        //displays intro text
        ui.displayIntro();
        //displays arrival text sends ship as the expected spaceship
        ui.displayArrival(ship5, alien1,alien2,alien3,alien4);
        //Display User's Name and sends Quibberwibberdoodlepoop as the expected life form
        ui.displayName(Quibberwibberdoodlepoop);
        //Display Home Planet
        ui.displayHomePlanet(characterInfo.getUserName());
        //Display Skill
        ui.displaySkill();
        //Prints out all the things the user inputted.
        ui.displayCharacterInfo(characterInfo.getUserName(), characterInfo.getHomePlanet(), characterInfo.getSpecialSkill());
        //deplete health from the bonk to the head
        //gives the user time to read
        ui.waitForResponse();
        //display current stats
        ui.displayStats();
        //continues the story and takes in the ships 1-4 to display
        ui.continuePart1(ship1,ship2,ship3,ship4);
    }
}