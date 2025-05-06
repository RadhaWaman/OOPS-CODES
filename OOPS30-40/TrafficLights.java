// TrafficLight class with basic attributes
class TrafficLight {
    private String color;  // Traffic light color
    private int duration;  // Duration in seconds

    // Constructor to initialize color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String color) {
        this.color = color;
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equals("Red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equals("Green");
    }

    // Method to display the current state
    public void displayStatus() {
        System.out.println(color + " light for " + duration + " seconds.");
    }
}

// Main class to test TrafficLight
public class TrafficLights {
    public static void main(String[] args) {
        // Creating a TrafficLight object with initial color and duration
        TrafficLight light = new TrafficLight("Red", 60);

        // Displaying the current light status
        light.displayStatus();

        // Change the color to green
        light.changeColor("Green");
        light.displayStatus();

        // Check the light status
        if (light.isRed()) {
            System.out.println("The light is Red.");
        } else if (light.isGreen()) {
            System.out.println("The light is Green.");
        }
    }
}
