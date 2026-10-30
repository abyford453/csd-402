
/*
 * Drew Byford
 * CSD-402 Java for Programmers
 * Module 2 - Rock Paper Scissors
 * 10/30/2026
 *
 * Thisprogram plays Rock Paper Scissors against the computer.
 * The computer randomly picks 1, 2, or 3 and the user
 * enters their choice. The program determines the winner.
 */

import java.util.Scanner;
import java.util.Random;

public class ByfordRockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playing = true;

        System.out.println("Welcome to Rock Paper Scissors!");

        while (playing) {

            System.out.println("\n1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            int player = 0;

            // Keep asking until the user enters a valid choice.
            while (player < 1 || player > 3) {

                System.out.print("\nChoose 1, 2, or 3: ");

                if (!input.hasNextLine()) {
                    System.out.println("\nInput ended. Goodbye!");
                    input.close();
                    return;
                }

                String answer = input.nextLine().trim();

                if (answer.equals("1") ||
                    answer.equals("2") ||
                    answer.equals("3")) {

                    player = Integer.parseInt(answer);

                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }

            int computer = random.nextInt(3) + 1;

            System.out.println("\nYou picked: " + choices[player - 1]);
            System.out.println("Computer picked: " + choices[computer - 1]);

            if (player == computer) {
                System.out.println("It's a tie!");
            } else if ((player == 1 && computer == 3) ||
                       (player == 2 && computer == 1) ||
                       (player == 3 && computer == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask if the user wants another round.
            while (true) {
                System.out.print("\nPlay again? (Y/N): ");

                if (!input.hasNextLine()) {
                    System.out.println("\nInput ended. Goodbye!");
                    input.close();
                    return;
                }

                String again = input.nextLine().trim();

                if (again.equalsIgnoreCase("Y")) {
                    break;
                } else if (again.equalsIgnoreCase("N")) {
                    playing = false;
                    break;
                } else {
                    System.out.println("Please enter Y or N.");
                }
            }
        }

        System.out.println("\nThanks for playing!");
        input.close();
    }
}
