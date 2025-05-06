import java.util.Scanner;

public class TrianglePatterns {
    // Function to print Pascal's Triangle
    static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Formula for nCr
            }
            System.out.println();
        }
    }

    // Function to print Number Triangle
    static void printNumberTriangle(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("\nPascal's Triangle:");
        printPascalsTriangle(rows);

        System.out.println("\nNumber Triangle:");
        printNumberTriangle(rows);
    }
}
 