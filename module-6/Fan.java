
/*
 * Drew Byford
 * CSD-402 Java for Programmers
 * Module 6 - Fan Class
 * November 12, 2026
 *
 * This class represents a fan with adjustable speed,
 * power, radius, and color.
 */

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this();
        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColor(color);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < STOPPED || speed > FAST) {
            throw new IllegalArgumentException(
                "Speed must be between 0 and 3."
            );
        }
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException(
                "Radius must be a positive number."
            );
        }
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Color cannot be empty."
            );
        }
        this.color = color.trim();
    }

    // Return a description of the fan.
    @Override
    public String toString() {
        String status = on ? "On" : "Off";

        String speedName;

        switch (speed) {
            case SLOW:
                speedName = "Slow";
                break;
            case MEDIUM:
                speedName = "Medium";
                break;
            case FAST:
                speedName = "Fast";
                break;
            default:
                speedName = "Stopped";
        }

        return "Fan Status: " + status
            + "\nSpeed: " + speedName
            + "\nRadius: " + radius
            + "\nColor: " + color;
    }
}
