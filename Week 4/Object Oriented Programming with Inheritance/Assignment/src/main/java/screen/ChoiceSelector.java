package screen;

import classes.character.CharacterInfo;

import java.util.Scanner;

public class ChoiceSelector {
    Scanner scanner = new Scanner(System.in);
    CharacterInfo characterInfo;

    public String lifeformSelector() {
        while (true) {
            //displays the options for lifeforms
            System.out.println("Choose a lifeform to become");
            System.out.println("1. Human - Boost Health and Strength");
            System.out.println("2. Alien - Boost Speed and Stamina");
            System.out.print("Enter the number of your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    return "Human";
                case 2:
                    return "Alien";
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 or 2.");
            }
        }
    }

    public String nationalitySelector() {
        while (true) {
            System.out.println("Choose your nationality:");
            System.out.println("1. Chinese");
            System.out.println("2. Indian");
            System.out.println("3. American");
            System.out.println("4. Indonesian");
            System.out.println("5. Pakistani");
            System.out.println("6. Brazilian");
            System.out.println("7. Nigerian");
            System.out.print("Enter the number of your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    return "Chinese";
                case 2:
                    return "Indian";
                case 3:
                    return "American";
                case 4:
                    return "Indonesian";
                case 5:
                    return "Pakistani";
                case 6:
                    return "Brazilian";
                case 7:
                    return "Nigerian";
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    public String speciesSelector() {
        while (true) {
            System.out.println("Choose your species:");
            System.out.println("1. Zygonians");
            System.out.println("2. Quadraxians");
            System.out.println("3. Luminauts");
            System.out.println("4. Phantasmagorians");
            System.out.println("5. Chronomorphs");
            System.out.print("Enter the number of your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            String species;
            switch (choice) {
                case 1:
                    return "Zygonians";
                case 2:
                    return "Quadraxians";
                case 3:
                    return "Luminauts";
                case 4:
                    return "Phantasmagorians";
                case 5:
                    return "Chronomorphs";
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    public String specialSkillSelector() {
        //while there is an invalid choice being made it will ask for a valid choice
        while (true) {
            //displays the options for a special skill
            System.out.println("Choose your special skill:");
            System.out.println("1. Tank - boosts health");
            System.out.println("2. Muscle Builder - boosts strength");
            System.out.println("3. Turtle Shell - boosts defense ");
            System.out.println("4. New Sneakers - boosts speed");
            System.out.println("5. Gunslinger - boosts accuracy");
            System.out.println("6. Underwater Breather - boosts stamina");
            System.out.print("Enter the number of your choice: ");
            //stores the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();
            //switch to return the user choice/selected option
            switch (choice) {
                case 1:
                    return "Tank";
                case 2:
                    return "Muscle Builder";
                case 3:
                    return "Turtle Shell";
                case 4:
                    return "New Sneakers";
                case 5:
                    return "Gunslinger";
                case 6:
                    return "Underwater Breather";
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    public String joinQuibberwibberdoodlepoop() {
        // Display options for yes or no
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1)
            return "Alright Lets get started.";
        else {
            return "Doesn't matter lets go.";
        }
    }

    String password = "Shorts";

    public String unlockDoor() {
        int incorrectAttempts = 0; // Initialize the counter for incorrect attempts

        // Keep prompting the user until the correct password is entered or maximum attempts reached
        while (true) {
            // Prompt the user to enter the password
            System.out.print("Enter the password to unlock the door: ");
            String enteredPassword = scanner.nextLine();

            // Compare the entered password with the correct password
            if (enteredPassword.equals(password)) {
                // Return a message indicating that the door is unlocked
                return "The door is unlocked. You may proceed.";
            } else {
                // Increment the counter for incorrect attempts
                incorrectAttempts++;

                // Inform the user that the entered password is incorrect
                System.out.println("Incorrect password. Please try again.");

                // Check if the user has exceeded the maximum number of attempts
                if (incorrectAttempts >= 3) {
                    // Return a message asking for a clue after three incorrect attempts
                    System.out.println("You've made 3 incorrect attempts. Here's a clue: What's my nickname?");
                }
            }
        }
    }

}

