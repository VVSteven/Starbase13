package classes;

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
}
