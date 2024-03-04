package screen;

import java.util.Scanner;

public class ChoiceSelector {
    Scanner scanner = new Scanner(System.in);

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

