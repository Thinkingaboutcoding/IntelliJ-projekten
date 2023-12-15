import java.util.Random;
import java.util.Scanner;

public class UntitledFightingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerHealth = 100;
        int opponentHealth = 100;
        int playerLevel = 1;
        int playerXP = 0;
        int opponentXP = 20;

        while (playerHealth > 0) {
            System.out.println("Your opponent has chosen. It's time to fight!");
            System.out.println("Player Level: " + playerLevel);
            System.out.println("Player XP: " + playerXP);
            System.out.println("Player Health: " + playerHealth);
            System.out.println("Opponent Health: " + opponentHealth);

            System.out.println("Choose your move:");
            System.out.println("1. Quick Attack");
            System.out.println("2. Strong Attack");
            System.out.println("3. Special Move");
            System.out.println("4. Run Away");

            int playerChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (playerChoice == 4) {
                System.out.println("You ran away from the fight. Game Over!");
                break;
            }

            int opponentChoice = random.nextInt(3) + 1;

            int playerDamage = calculatePlayerDamage(playerChoice, random);
            int opponentDamage = calculateOpponentDamage(opponentChoice, random);

            System.out.println("You dealt " + playerDamage + " damage to your opponent.");
            System.out.println("Your opponent dealt " + opponentDamage + " damage to you.");

            playerHealth -= opponentDamage;
            opponentHealth -= playerDamage;

            if (opponentHealth <= 0) {
                System.out.println("Congratulations! You have defeated your opponent!");
                playerXP += opponentXP;

                if (playerXP >= 50 * playerLevel) {
                    playerLevel++;
                    System.out.println("You leveled up! You are now Level " + playerLevel + "!");
                    playerHealth = 100;
                }

                // Heal the player after winning
                int healing = 20 + random.nextInt(11); // Random healing between 20 and 30
                playerHealth = Math.min(100, playerHealth + healing);

                System.out.println("You healed for " + healing + " health.");

                System.out.println("Do you want to continue fighting? (yes/no)");
                String continueChoice = scanner.next().toLowerCase();
                scanner.nextLine(); // Consume the newline character

                if (!continueChoice.equals("yes")) {
                    System.out.println("Thanks for playing! Game Over!");
                    break;
                } else {
                    opponentHealth = 100;
                }
            } else if (playerHealth <= 0) {
                System.out.println("You have been defeated! Game Over!");

                int tauntChance = random.nextInt(100);
                if (tauntChance < 30) {
                    System.out.println("Your opponent taunts you: " + getRandomTaunt());
                }

                break;
            }
        }

        scanner.close();
    }

    private static int calculatePlayerDamage(int move, Random random) {
        int baseDamage = 20;

        switch (move) {
            case 1:
                return baseDamage;
            case 2:
                return baseDamage * 2;
            case 3:
                return random.nextInt(21) + 20; // Random damage between 20 and 40
            default:
                return 0;
        }
    }

    private static int calculateOpponentDamage(int move, Random random) {
        int baseDamage = 15;

        switch (move) {
            case 1:
                return baseDamage;
            case 2:
                return baseDamage * 2;
            case 3:
                int specialChance = random.nextInt(100);
                if (specialChance < 20) {
                    return (int) (baseDamage * 1.1); // 10% more damage
                } else {
                    return baseDamage;
                }
            default:
                return 0;
        }
    }

    private static String getRandomTaunt() {
        String[] taunts = {
                "You're no match for my skills!",
                "Is that all you've got?",
                "You fight like a beginner!",
                "You can't defeat me!",
                "This is too easy!"
        };
        Random random = new Random();
        return taunts[random.nextInt(taunts.length)];
    }
}
