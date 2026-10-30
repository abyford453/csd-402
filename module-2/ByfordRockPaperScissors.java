
/*
 * Student: Drew Byford
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 2 - Rock Paper Scissors
 * Date: October 30, 2026
 *
 * Description:
 * This program allows a user to play Rock-Paper-Scissors
 * against the computer. The computer randomly generates
 * a number between 1 and 3.
 *
 * The program validates user input and allows the user
 * to retry invalid entries without restarting.
 *
 * 1 = Rock
 * 2 = Paper
 * 3 = Scissors
 */

import java.util.Random;
import java.util.Scanner;

public class ByfordRockPaperScissors {

    public static void main(String[] args) {

        Random random = new Random();

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("================================");
            System.out.println("       ROCK PAPER SCISSORS      ");
            System.out.println("================================");

            boolean playAgain = true;

            while (playAgain) {

                System.out.println();
                System.out.println("1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissors");
                System.out.println("Q - Quit");
                System.out.println();

                int playerChoice = 0;

                // Continue prompting until valid input is received.
                while (playerChoice == 0) {

                    System.out.print(
                        "Enter your choice (1, 2, 3, or Q): "
                    );

                    // Handle end-of-input without throwing an exception.
                    if (!input.hasNextLine()) {
                        System.out.println(
                            "\nInput closed. Exiting game."
                        );
                        return;
                    }

                    String userInput = input.nextLine().trim();

                    // Allow the user to exit at any time.
                    if (userInput.equalsIgnoreCase("Q")) {
                        System.out.println(
                            "Thanks for playing!"
                        );
                        return;
                    }

                    // Reject empty input.
                    if (userInput.isEmpty()) {
                        System.out.println(
                            "Error: Input cannot be empty."
                        );
                        continue;
                    }

                    // Accept only the exact values 1, 2, or 3.
                    if (!userInput.matches("[123]")) {
                        System.out.println(
                            "Error: Invalid selection. " +
                            "Please enter 1, 2, 3, or Q."
                        );
                        continue;
                    }

                    playerChoice = Integer.parseInt(userInput);
                }

                // Generate the computer's selection.
                int computerChoice = random.nextInt(3) + 1;

                String[] choices = {
                    "Rock", "Paper", "Scissors"
                };

                String playerName = choices[playerChoice - 1];
                String computerName = choices[computerChoice - 1];

                System.out.println();
                System.out.println("========== RESULTS ==========");
                System.out.println("Your selection: " + playerName);
                System.out.println(
                    "Computer selection: " + computerName
                );

                // Compare selections to determine the winner.
                if (playerChoice == computerChoice) {

                    System.out.println("Result: It's a tie!");

                } else if (
                    (playerChoice == 1 && computerChoice == 3) ||
                    (playerChoice == 2 && computerChoice == 1) ||
                    (playerChoice == 3 && computerChoice == 2)
                ) {

                    System.out.println("Result: You win!");

                } else {

                    System.out.println("Result: Computer wins!");

                }

                System.out.println("=============================");
                System.out.println();

                // Validate whether the player wants another round.
                while (true) {

                    System.out.print(
                        "Would you like to play again? (Y/N): "
                    );

                    if (!input.hasNextLine()) {
                        System.out.println(
                            "\nInput closed. Exiting game."
                        );
                        return;
                    }

                    String answer = input.nextLine().trim();

                    if (answer.equalsIgnoreCase("Y")) {
                        break;
                    }

                    if (answer.equalsIgnoreCase("N")) {
                        playAgain = false;
                        System.out.println(
                            "Thanks for playing!"
                        );
                        break;
                    }

                    System.out.println(
                        "Error: Please enter Y for Yes or N for No."
                    );
                }
            }
        }
    }
}
