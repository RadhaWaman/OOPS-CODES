import java.util.Scanner;

public class VowelRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();

        // Initialize StringBuilder with the original paragraph
        StringBuilder transformedParagraph = new StringBuilder(paragraph);
        
        // Count of removed vowels
        int removedCount = 0;

        // Loop through the paragraph and remove vowels
        for (int i = 0; i < transformedParagraph.length(); i++) {
            char currentChar = transformedParagraph.charAt(i);

            // Check if the current character is a vowel (both lowercase and uppercase)
            if (isVowel(currentChar)) {
                transformedParagraph.deleteCharAt(i); // Remove the vowel
                removedCount++; // Increment the removed vowel count
                i--; // Adjust index after removal
            }
        }

        // Display the transformed paragraph and the count of removed characters
        System.out.println("Transformed Paragraph: " + transformedParagraph);
        System.out.println("Total Characters Removed: " + removedCount);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert to lowercase for uniform comparison
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
