import java.util.Scanner;

public class CinemaSeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define number of rows and columns in the cinema hall
        int rows = 5, cols = 5;
        int[][] seats = new int[rows][cols]; // All seats initialized to 0

        while (true) {
            System.out.println("\n--- Cinema Seating System ---");
            System.out.println("1. Book a seat");
            System.out.println("2. Show seat map");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter row (0 to " + (rows - 1) + "): ");
                int row = sc.nextInt();
                System.out.print("Enter column (0 to " + (cols - 1) + "): ");
                int col = sc.nextInt();

                if (row >= 0 && row < rows && col >= 0 && col < cols) {
                    if (seats[row][col] == 0) {
                        seats[row][col] = 1;
                        System.out.println("Seat booked successfully!");
                    } else {
                        System.out.println("Seat already booked!");
                    }
                } else {
                    System.out.println("Invalid seat position!");
                }
            } else if (choice == 2) {
                System.out.println("\nSeat Map (0 = Available, 1 = Booked):");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(seats[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (choice == 3) {
                System.out.println("Exiting the system.");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
  