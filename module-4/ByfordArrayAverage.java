
/*
 * Drew Byford
 * CSD-402 Java for Programmers
 * Module 4 - Overloaded Methods
 * November 8, 2026
 *
 * This program uses four overloaded average methods
 * to calculate the average of short, int, long,
 * and double arrays. Each test array has a
 * different number of elements.
 */

import java.util.Arrays;

public class ByfordArrayAverage {

    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Short array cannot be empty.");
        }

        long total = 0;

        for (short number : array) {
            total += number;
        }

        return (short) (total / array.length);
    }

    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Integer array cannot be empty.");
        }

        long total = 0;

        for (int number : array) {
            total += number;
        }

        return (int) (total / array.length);
    }

    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Long array cannot be empty.");
        }

        double total = 0;

        for (long number : array) {
            total += number;
        }

        return (long) (total / array.length);
    }

    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Double array cannot be empty.");
        }

        double total = 0;

        for (double number : array) {
            total += number;
        }

        return total / array.length;
    }

    public static void main(String[] args) {

        short[] shortNumbers = {10, 20, 30};
        int[] intNumbers = {5, 10, 15, 20};
        long[] longNumbers = {100, 200, 300, 400, 500};
        double[] doubleNumbers = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        System.out.println("CSD-402 Module 4 - Array Averages");
        System.out.println("--------------------------------");

        System.out.println("\nShort Array:");
        System.out.println("Values: " + Arrays.toString(shortNumbers));
        System.out.println("Average: " + average(shortNumbers));

        System.out.println("\nInteger Array:");
        System.out.println("Values: " + Arrays.toString(intNumbers));
        System.out.println("Average: " + average(intNumbers));

        System.out.println("\nLong Array:");
        System.out.println("Values: " + Arrays.toString(longNumbers));
        System.out.println("Average: " + average(longNumbers));

        System.out.println("\nDouble Array:");
        System.out.println("Values: " + Arrays.toString(doubleNumbers));
        System.out.printf("Average: %.2f%n", average(doubleNumbers));
    }
}
