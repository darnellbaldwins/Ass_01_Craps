import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int DieRoll1;
        int DieRoll2;
        boolean playAgain = true;
        while (playAgain) {
            int sum;
            int point = 0;
            DieRoll1 = random.nextInt(6) + 1;
            DieRoll2 = random.nextInt(6) + 1;
            sum = DieRoll1 + DieRoll2;
            System.out.println("You rolled a: " + DieRoll1 + " and " + DieRoll2 + " (sum: " + sum + ")");

            if (sum == 2) {
                System.out.println("Craps, you lose.");
            } else if (sum == 3) {
                System.out.println("Craps, you lose.");
            } else if (sum ==12) {
                System.out.println("Craps, you lose.");
            } else if (sum == 7) {
                System.out.println("You won");
            } else if (sum == 11) {
                System.out.println("Natural, you won");
            } else {
                point = sum;
                System.out.println("The point is: " + point);
                while (true) {
                    DieRoll1 = random.nextInt(6) + 1;
                    DieRoll2 = random.nextInt(6) + 1;
                    sum = DieRoll1 + DieRoll2;

                    System.out.println("You rolled: " + DieRoll1 + " and " + DieRoll2 + " (sum: " + sum + ")");

                    if (sum == point) {
                        System.out.println("You got the required points, ypu win!.");
                        break;
                    } else if (sum == 7) {
                        System.out.println("You lost.");
                        break;
                    } else {
                        System.out.println("Rolling");
                    }
                }
            }

            System.out.print("Play (y/n): ");
            playAgain = scanner.nextLine().equalsIgnoreCase("y");
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

