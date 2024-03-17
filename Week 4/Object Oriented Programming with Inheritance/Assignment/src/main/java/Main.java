// imports the character class to create a character and use the methods form the class

import classes.BoxingRing;
import classes.lifeform.Alien;
import classes.lifeform.Human;
import screen.ChoiceSelector;
import classes.character.Character;
// imports the stats class to be able to update and keep track of the character's stats
import classes.character.CharacterInfo;
import classes.character.level.CharacterStats;
import classes.lifeform.Lifeform;
import classes.Spaceship;
// imports the user interface from the screen folder using "*" symbol (which means all)
// and now able to use the methods in the UserInterface class
import screen.*;

// creates a class called Main to match the name of the java file
public class Main {
    //public means that this can be called from anywhere
    public static void main(String[] args) {
        //creates ships with different descriptions / characteristics
        Spaceship ship1 = new Spaceship("Small cargo ship with blue stripes and yellow flames.");
        Spaceship ship2 = new Spaceship("An absolute speed demon with rockets everywhere");
        Spaceship ship3 = new Spaceship("Looks like the Millennium Falcon but tiny");
        Spaceship ship4 = new Spaceship("Can turn invisible and is super slow");
        Spaceship ship5 = new Spaceship("in the shape of a donut");

        //creates alien with different ranks and description
        CharacterStats opponentRank1 = new CharacterStats(1);
        CharacterStats opponentRank2 = new CharacterStats(2);
        CharacterStats opponentRank3 = new CharacterStats(3);
        CharacterStats opponentRank10 = new CharacterStats(10);

        Alien Quibberwibberdoodlepoop = new Alien("Quibberwibberdoodlepoop",opponentRank10,"Looks like Squidward");
        Alien Ragnor = new Alien("Ragnor the Crusher",opponentRank1,"Huge eye but small body");
        Human Rocky = new Human("Rocky Balboa",opponentRank2, "Rocky Balboa is a legendary boxer known for his indomitable spirit and relentless determination inside the ring.");
        Human Vexor = new Human("Vexor the Vanquisher",opponentRank3,"Huge body but small eye");
        Alien Muhammad = new Alien("Muhammad Ali",opponentRank3,"Muhammad Ali is a towering figure in the world of boxing, revered for his unparalleled skill, charisma, and larger-than-life personality. ");

        CharacterInfo characterInfo = new CharacterInfo(" "," ", " "," ");
        // creates the stats at the start to be used throughout.
        CharacterStats characterStats = new CharacterStats(1);
        //Creates a new character taking in empty parameters as of now but will be updated later
        Character mainCharacter = new Character(characterInfo, characterStats);
        // Create a ChoiceSelector
        ChoiceSelector choiceSelector = new ChoiceSelector();
        //Passing in the character to the user interface to only work on character that was just created
        UserInterface ui = new UserInterface(mainCharacter, choiceSelector);
        //displays intro text
        ui.displayIntro();
        ui.enterCharacterInfo();
        //displays second part of the intro text
        ui.displayIntroPart2();
        //displays arrival text sends ship as the expected spaceship
        ui.displayCharacterInfo();
        ui.displayArrival(ship5);
        //Display User's Name and sends Quibberwibberdoodlepoop as the expected life form
        ui.displayName(Quibberwibberdoodlepoop);
        //Display Home Planet
        ui.displayHomePlanet();
        //Display Skill
        ui.displaySkill();
        //Prints out all the things the user inputted.
        ui.displayQuibberwibberdoodlepoopPlan(characterInfo.getUserName(), characterInfo.getHomePlanet(), characterInfo.getSpecialSkill());
        //deplete health from the bonk to the head
        //gives the user time to read
        ui.waitForResponse();
        //display current stats
        ui.displayStats();
        //continues the story and takes in the ships 1-4 to display
        ui.continuePart1(ship1,ship2,ship3,ship4);
        ui.continuePart2();

        //creates room objects with fighters
        BoxingRing quibberwibberdoodlepoopRoom = new BoxingRing(mainCharacter, Quibberwibberdoodlepoop, "A dimly lit room, awaits your presence");
        BoxingRing room1 = new BoxingRing(mainCharacter, Ragnor, "Empty ring with just nothing special.");
        BoxingRing room2 = new BoxingRing(mainCharacter, Rocky, "A brightly illuminated ring with a roaring crowd cheering from the stands.");
        BoxingRing room3 = new BoxingRing(mainCharacter, Vexor, "A small, intimate ring tucked away in the corner of the gym.");
        BoxingRing room4 = new BoxingRing(mainCharacter, Muhammad, "An expansive, state-of-the-art ring equipped with high-tech training equipment.");

        ui.enterQuibberwibberdoodlepoopDoor();
        ui.fightQuibberwibberdoodlepoop(quibberwibberdoodlepoopRoom);
        ui.fightOpponent1(Ragnor,room1);
        ui.fightOpponent2(Rocky,room2);
        ui.fightOpponent3(Vexor,room3);
        ui.fightOpponent4(Muhammad,room4);
        ui.continuePart3();
    }
}