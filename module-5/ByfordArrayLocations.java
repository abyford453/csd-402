
/*
 * Drew Byford
 * CSD-402 Java for Programmers
 * Module 5 - Two-Dimensional Arrays
 * November 12, 2026
 *
 * This program finds the largest and smallest values
 * in two-dimensional int and double arrays.
 * Each method returns the row and column location.
 */

public class ByfordArrayLocations {

    // Find the largest value in a double array.
    public static int[] locateLargest(double[][] arrayParam) {
        validateArray(arrayParam);

        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Find the largest value in an int array.
    public static int[] locateLargest(int[][] arrayParam) {
        validateArray(arrayParam);

        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > largest) {
                    largest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Find the smallest value in a double array.
    public static int[] locateSmallest(double[][] arrayParam) {
        validateArray(arrayParam);

        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Find the smallest value in an int array.
    public static int[] locateSmallest(int[][] arrayParam) {
        validateArray(arrayParam);

        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < smallest) {
                    smallest = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }
        return location;
    }

    // Check that the array contains usable values.
    public static void validateArray(int[][] array) {
        if (array == null || array.length == 0 ||
            array[0] == null || array[0].length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        for (int[] row : array) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException("Array contains an empty row.");
            }
        }
    }

    public static void validateArray(double[][] array) {
        if (array == null || array.length == 0 ||
            array[0] == null || array[0].length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        for (double[] row : array) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException("Array contains an empty row.");
            }

            for (double value : row) {
                if (Double.isNaN(value)) {
                    throw new IllegalArgumentException("Array cannot contain NaN.");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] intArray = {
            {12, 45, 7},
            {89, 23, 56},
            {34, 2, 71}
        };

        double[][] doubleArray = {
            {4.5, 12.8, 3.2},
            {7.6, 1.4, 19.9},
            {15.3, 8.7, 6.1}
        };

        System.out.println("CSD-402 Module 5 - Array Locations");
        System.out.println("----------------------------------");

        System.out.println("\nInteger Array:");
        displayArray(intArray);

        int[] intMax = locateLargest(intArray);
        int[] intMin = locateSmallest(intArray);

        System.out.println("Largest: " +
            intArray[intMax[0]][intMax[1]] +
            " at row " + intMax[0] + ", column " + intMax[1]);

        System.out.println("Smallest: " +
            intArray[intMin[0]][intMin[1]] +
            " at row " + intMin[0] + ", column " + intMin[1]);

        System.out.println("\nDouble Array:");
        displayArray(doubleArray);

        int[] doubleMax = locateLargest(doubleArray);
        int[] doubleMin = locateSmallest(doubleArray);

        System.out.println("Largest: " +
            doubleArray[doubleMax[0]][doubleMax[1]] +
            " at row " + doubleMax[0] + ", column " + doubleMax[1]);

        System.out.println("Smallest: " +
            doubleArray[doubleMin[0]][doubleMin[1]] +
            " at row " + doubleMin[0] + ", column " + doubleMin[1]);
    }

    // Display the original array in rows.
    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.printf("%8d", value);
            }
            System.out.println();
        }
    }

    public static void displayArray(double[][] array) {
        for (double[] row : array) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }
}
