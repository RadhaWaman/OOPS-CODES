import java.util.Scanner;

public class StringOperations {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }
        return true; // It is a palindrome if all characters match
    }

    // Function to count occurrences of a specific character in a string
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        
        // Loop through the string and count occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    // Function to remove all whitespace from a string
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", ""); // Remove all spaces using regular expression
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Check if a given string is a palindrome
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str1 = scanner.nextLine();
        if (isPalindrome(str1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Task 2: Count occurrences of a specific character
        System.out.print("Enter a string to count character occurrences: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter the character to count: ");
        char ch = scanner.next().charAt(0);
        int count = countOccurrences(str2, ch);
        System.out.println("The character '" + ch + "' appears " + count + " times.");

        // Task 3: Remove all whitespace from a string
        System.out.print("Enter a string to remove all whitespaces: ");
        scanner.nextLine(); // Consume newline left by nextInt()
        String str3 = scanner.nextLine();
        String result = removeWhitespace(str3);
        System.out.println("String without whitespace: " + result);

        scanner.close(); // Close the scanner to avoid resource leak
    }
}





/*

import java.util.Scanner;

public class StringOperations {

    // Function to check if a string is a palindrome using StringBuilder
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().equals(sb.reverse().toString()); // Reverse the string and compare
    }

    // Function to count occurrences of a specific character in a string
    public static long countOccurrences(String str, char ch) {
        return str.chars().filter(c -> c == ch).count(); // Count occurrences using stream
    }

    // Function to remove all whitespace from a string
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", ""); // Use regex to remove all whitespace
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Check if a given string is a palindrome
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str1 = scanner.nextLine();
        if (isPalindrome(str1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Task 2: Count occurrences of a specific character
        System.out.print("Enter a string to count character occurrences: ");
        String str2 = scanner.nextLine();
        System.out.print("Enter the character to count: ");
        char ch = scanner.next().charAt(0);
        long count = countOccurrences(str2, ch);
        System.out.println("The character '" + ch + "' appears " + count + " times.");

        // Task 3: Remove all whitespace from a string
        System.out.print("Enter a string to remove all whitespaces: ");
        scanner.nextLine(); // Consume newline left by nextInt()
        String str3 = scanner.nextLine();
        String result = removeWhitespace(str3);
        System.out.println("String without whitespace: " + result);

        scanner.close(); // Close the scanner to avoid resource leak
    }
} 

*/
