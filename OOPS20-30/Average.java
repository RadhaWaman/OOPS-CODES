import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int[5];
        int sum = 0;
        double average = 0.0;

        try {
            // Prompt the user for 5 integers
            System.out.println("Please enter 5 integers:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                nums[i] = scanner.nextInt();
            }

            // Calculate the sum
            for (int num : nums) {
                sum += num;
            }

            // Calculate the average
            if (nums.length != 0) {
                average = sum / (double) nums.length;
            }

            // Display results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}
