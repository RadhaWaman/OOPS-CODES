import java.util.Scanner;

public class UniqueDigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        // Array to count digit frequencies (0 to 9)
        int[] count = new int[10];

        // Count the frequency of each digit
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                count[digit]++;
            }
        }

        // Count how many digits appeared only once
        int uniqueCount = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] == 1) {
                uniqueCount++;
            }
        }

        System.out.println("Number of unique digits: " + uniqueCount);
    }
}
