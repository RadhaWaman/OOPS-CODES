import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;

public class URLFinder {
    private String url;

    // Constructor
    public URLFinder(String url) {
        this.url = url;
    }

    // Method to check if URL is valid
    public boolean urlChecker(String inputUrl) {
        try {
            new URL(inputUrl); // Try to create a URL object
            return true;
        } catch (MalformedURLException e) {
            return false;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a URL to check: ");
        String userInput = scanner.nextLine();

        URLFinder finder = new URLFinder(userInput);
        boolean isValid = finder.urlChecker(userInput);

        if (isValid) {
            System.out.println("The URL is valid.");
        } else {
            System.out.println("The URL is invalid.");
        }
    }
}
