
// imports a scanner to can the user's text
import java.util.Scanner;
// creates a class called Main to match the name of the java file
public class Main {

    //public means that this can be called from anywhere
    public static void main(String[] args) {
        //creates the userName string variable
        String userName;
        //creates the homePlanet string variable
        String homePlanet;
        //creates the specialSkill string variable
        String specialSkill;
        // creates a scanner to can the user's text
        Scanner scanner = new Scanner(System.in);

        // System.out.println() will print out in every line
        // parentheses and/or quotation marks.
        System.out.println("Welcome to StarBase13");
        System.out.println("========================");
        // StarBase13 description and purpose
        System.out.println("StarBase13 is a space station");
        System.out.println("it is simalier to a cities on earth.");
        System.out.println("The main diffrence is that there are not only humans but extra terrestrials as well.");
        System.out.println("Folks come from all over the galaxy to watch and become pro boxers.");
        System.out.println("Your destiny is to defend your planet from being destroyed");
        System.out.println("Only the bottom ten planets are devastated");
        System.out.println("There are millions of planets so your home can be saved.");
        //created a space in the terminal
        System.out.println();

        // System.out.print() will do the dame as System.out.println() but will not create and use a new line 
        //This will ask the user for thier name
        System.out.print("???: Yo, what is your name? ");
        //Gets the user's name and holds it in the userName string
        userName = scanner.nextLine();
        //print out the user's name
        System.out.println("Quibberwibberdoodlepoop: Hey " + userName + ", My name is Quibberwibberdoodlepoop");
        System.out.println("Quibberwibberdoodlepoop: But you can call me, Shorts");
        System.out.print("Quibberwibberdoodlepoop: Umm, " + userName + " what planet are your from? ");
        //Gets the user's home planet and holds it in the homePlanet string
        homePlanet = scanner.nextLine();
        //Prints the user's home planet
        System.out.println("Quibberwibberdoodlepoop: Oh ok, I've heard of " + homePlanet + " before.");
        System.out.print("Quibberwibberdoodlepoop: And by the way, what is your special skill? ");
        //Gets the user's special skill holds it in the specialSkill string
        specialSkill = scanner.nextLine();
        //Prints out all the things the user inputed.
        System.out.println("Quibberwibberdoodlepoop: Just so I can write in my notes, Your name is " + userName + ", You are from " + homePlanet
                + ", and your special is " + specialSkill + ".");

        System.out.println();
        System.out.println("**You are knocked out from behind**");
        System.out.println();
        //Close the scanner to release resources
        scanner.close();
    }
}