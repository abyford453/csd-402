/*
 * Drew Byford
 * CSD-402 Java for Programmers
 * Module 6 - Fan Class Test
 * November 12, 2026
 *
 * Tests both Fan constructors, getters, setters,
 * toString, and invalid values.
 */

public class FanTest {

    public static void main(String[] args) {

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println("CSD-402 Module 6 - Fan Test");
        System.out.println("---------------------------");

        System.out.println("\nFan 1 - Default Settings");
        System.out.println(fan1);

        System.out.println("\nFan 2 - Custom Settings");
        System.out.println(fan2);

        // Update the first fan.
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println("\nFan 1 - Updated Settings");
        System.out.println(fan1);

        System.out.println("\nTesting Getters");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("Power: " + fan1.getOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());

        // Turn off the second fan.
        fan2.setOn(false);
        fan2.setSpeed(Fan.STOPPED);

        System.out.println("\nFan 2 - Turned Off");
        System.out.println(fan2);

        // Check invalid values.
        System.out.println("\nTesting Error Handling");

        try {
            fan1.setSpeed(5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            fan1.setRadius(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            fan1.setColor("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTesting complete.");
    }
}
