
/*
 * Drew Byford
 * CSD-402 Java for Programmers
 * Module 3 - Nested For Loops
 * October 30, 2026
 *
 * This program uses nested for loops to create a
 * number pyramid. The numbers double toward the
 * middle and decrease back to 1.
 * Each row ends with an @ symbol.
 */

public class ByfordNestedLoops {

    public static void main(String[] args) {

        // Create the seven rows of the pyramid.
        for (int row = 0; row < 7; row++) {

            String line = "";

            // Build the increasing numbers.
            int number = 1;

            for (int col = 0; col <= row; col++) {
                line += number + " ";
                number *= 2;
            }

            // Build the decreasing numbers.
            number /= 4;

            for (int col = row - 1; col >= 0; col--) {
                line += number + " ";
                number /= 2;
            }

            // Center the pyramid.
            int spaces = (40 - line.length()) / 2;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            System.out.print(line);

            // Keep the @ symbols in the same column.
            int remainingSpaces = 45 - spaces - line.length();

            for (int s = 0; s < remainingSpaces; s++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}
