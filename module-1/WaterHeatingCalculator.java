

/*
 * Student: Drew Byford
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 1 - Water Heating Calculator
 * Date: October 24, 2026
 *
 * Description:
 * This program calculates the energy required to
 * heat water from an initial temperature to a
 * final temperature.
 *
 * Formula:
 * Q = waterMass * (finalTemperature - initialTemperature) * 4184
 */

import java.util.Scanner;

public class WaterHeatingCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get the amount of water in kilograms.
        System.out.print("Enter water mass in kilograms: ");
        double waterMass = input.nextDouble();

        // Get the initial water temperature.
        System.out.print("Enter initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Get the final water temperature.
        System.out.print("Enter final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy required in Joules.
        double energy = waterMass
                * (finalTemperature - initialTemperature)
                * 4184;

        // Display the calculated energy.
        System.out.printf(
                "Energy required: %.2f Joules%n", energy
        );

        input.close();
    }
}
