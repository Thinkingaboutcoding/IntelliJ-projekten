import java.util.Scanner;

public class UntitledStoryGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Extended Text Adventure!");
        System.out.println("You find yourself in a dark and mysterious place...");

        // Start the adventure
        playScenario1(scanner);

        // Close the scanner
        scanner.close();
    }

    private static void playScenario1(Scanner scanner) {
        System.out.println("Scenario 1: You see a dim light in the distance. Do you want to investigate? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("You approach the light and discover a hidden passage.");
            playScenario2(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You decide to stay put. Suddenly, you hear a strange noise behind you.");
            playAlternateScenario1(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playScenario1(scanner);
        }
    }

    private static void playScenario2(Scanner scanner) {
        System.out.println("Scenario 2: The passage leads to a spooky room. Do you want to enter? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("You enter the room and find an ancient chest.");
            playScenario3(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You decide to explore another part of the passage.");
            playAlternateScenario2(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playScenario2(scanner);
        }
    }

    private static void playScenario3(Scanner scanner) {
        System.out.println("Scenario 3: The chest is locked. Do you want to try to open it? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("Congratulations! You've found a treasure. The end.");
        } else if (answer.equals("no")) {
            System.out.println("You decide to leave the chest alone and continue exploring.");
            playAlternateScenario3(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playScenario3(scanner);
        }
    }

    private static void playScenario4(Scanner scanner) {
        System.out.println("Scenario 4: You find a mysterious portal. Do you step through? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("The portal transports you to a different dimension with unknown challenges.");
            playScenario5(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You decide to avoid the portal and continue exploring the passage.");
            playAlternateScenario4(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playScenario4(scanner);
        }
    }

    private static void playScenario5(Scanner scanner) {
        System.out.println("Scenario 5: You hear footsteps approaching. Do you hide? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("You hide, and the footsteps pass by. You continue cautiously.");
            playScenario3(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You stand still, and the footsteps get louder. A shadowy figure emerges.");
            playAlternateScenario5(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playScenario5(scanner);
        }
    }

    private static void playAlternateScenario1(Scanner scanner) {
        System.out.println("Alternate Scenario 1: You encounter a mysterious figure. Do you want to approach? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("The figure disappears, leaving you uneasy. You decide to backtrack.");
            playScenario1(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You avoid the figure and find another path.");
            playScenario2(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playAlternateScenario1(scanner);
        }
    }

    private static void playAlternateScenario2(Scanner scanner) {
        System.out.println("Alternate Scenario 2: You find a mysterious portal. Do you step through? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("The portal transports you to a different dimension with unknown challenges.");
            playScenario4(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You decide to avoid the portal and continue exploring the passage.");
            playScenario3(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playAlternateScenario2(scanner);
        }
    }

    private static void playAlternateScenario3(Scanner scanner) {
        System.out.println("Alternate Scenario 3: You hear footsteps approaching. Do you hide? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("You hide, and the footsteps pass by. You continue cautiously.");
            playScenario2(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You stand still, and the footsteps get louder. A shadowy figure emerges.");
            playScenario5(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playAlternateScenario3(scanner);
        }
    }

    private static void playAlternateScenario4(Scanner scanner) {
        System.out.println("Alternate Scenario 4: You discover a hidden chamber. Do you enter? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("...");
            try {
                Thread.sleep(200);
                System.out.println("...");
                Thread.sleep(200);
                System.out.println("...");
                Thread.sleep(200);// Sleep for 200 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("...");
            System.out.println("The Figure has led you to a trap and you have now died.");
            System.out.println("Ȟ̴̫̬̤̳̯̔̑͌̀̎͆͗̆̅͜A̶̺̱̫͍̝̼͈̩̜͍͌́H̶̨͎̺̞̠̞̘̞̍́̒̐͘̚Å̴̭͙̝͚̀͆̂͋̎͘H̸̡̛̞̤̜͐̈̅̀͐Å̷̡̢̖͉̭͚̹̗̭̺̓̾Ḧ̴̨́̑͂̔͘A̸͔̗̝͑̈̈́͠Ḩ̵͇͈̻̣̳̘̮͈̟̎́͆̈́̒͌̀̊̇̆H̴͇̬̪͕̰̗̬̫͔̻̾͒̒̈́̿̚̚͝");
        } else if (answer.equals("no")) {
            System.out.println("You decide not to enter the chamber and continue your exploration.");
            playScenario4(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playAlternateScenario4(scanner);
        }
    }

    private static void playAlternateScenario5(Scanner scanner) {
        System.out.println("Alternate Scenario 5: The figure reveals itself to be friendly. Do you trust it? (yes/no)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("The friendly figure guides you to a hidden passage.");
            playAlternateScenario4(scanner);
        } else if (answer.equals("no")) {
            System.out.println("You decide not to trust the figure and find another route.");
            playScenario5(scanner);
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            playAlternateScenario5(scanner);
        }
    }
}

