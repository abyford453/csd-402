/*
 * Drew Byford
 * CSD-402 Java for Programmers
 * Module 7 - UseFans
 * November 12, 2026
 *
 * Uses a list of fans to test displaying individual
 * fans and the full collection.
 */

import java.util.ArrayList;
import java.util.Collection;

public class UseFans {

    // Get the settings from one fan and print them.
    public static void displayFan(Fan fan) {

        if (fan == null) {
            System.out.println("No fan to display.");
            return;
        }

        String speedName;

        switch (fan.getSpeed()) {
            case Fan.SLOW:
                speedName = "Slow";
                break;
            case Fan.MEDIUM:
                speedName = "Medium";
                break;
            case Fan.FAST:
                speedName = "Fast";
                break;
            default:
                speedName = "Stopped";
        }

        System.out.println("Fan Status: "
            + (fan.isOn() ? "On" : "Off"));
        System.out.println("Speed: " + speedName);
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    // Go through the list and print each fan's settings.
    public static void displayFans(Collection<Fan> fans) {

        if (fans == null || fans.isEmpty()) {
            System.out.println("No fans to display.");
            return;
        }

        int number = 1;

        for (Fan fan : fans) {
            System.out.println("\nFan " + number);
            System.out.println("--------------------");
            displayFan(fan);
            number++;
        }
    }

    public static void main(String[] args) {

        ArrayList<Fan> fans = new ArrayList<>();

        // Make four fans with different settings.
        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 8, "blue"));
        fans.add(new Fan(Fan.MEDIUM, true, 10, "black"));
        fans.add(new Fan(Fan.FAST, true, 12, "red"));

        System.out.println("CSD-402 Module 7 - UseFans");
        System.out.println("==========================");

        System.out.println("\nOriginal Fan Collection:");
        displayFans(fans);

        // Change the default fan to show that setters work.
        fans.get(0).setOn(true);
        fans.get(0).setSpeed(Fan.FAST);
        fans.get(0).setColor("green");

        System.out.println("\nUpdated First Fan:");
        displayFan(fans.get(0));

        System.out.println("\nTesting Empty Collection:");
        displayFans(new ArrayList<Fan>());

        System.out.println("\nTesting complete.");
    }
}
