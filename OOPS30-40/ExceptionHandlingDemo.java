import java.io.*;
import java.util.*;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. File Reading with Exception Handling and Auto-Creation
        System.out.print("Enter the file name to read: ");
        String filename = scanner.nextLine();

        File file = new File(filename);

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    FileWriter writer = new FileWriter(file);
                    writer.write("Sample content: File created because it did not exist.\n");
                    writer.close();
                    System.out.println("Note: File did not exist. A new file was created with sample content.");
                } else {
                    System.out.println("Error: Unable to create file.");
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to create the file due to an I/O error.");
            }
        }

        // Reading the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("\nFile Content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }

        // 2. Arithmetic Operation (Division)
        try {
            System.out.print("\nEnter numerator: ");
            int num = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denom = scanner.nextInt();

            int result = num / denom;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
            scanner.nextLine(); // Clear the buffer
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // 3. Array Access
        int[] numbers = {10, 20, 30};
        try {
            System.out.print("\nEnter array index to access (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index.");
        }

        // 4. Null Pointer Handling
        String text = null;
        try {
           
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot perform operations on a null object.");
        }

        System.out.println("\nProgram completed successfully.");
        scanner.close();
    }
}


/* 
import java.io.*;
import java.util.*;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. File Reading with Exception Handling
        System.out.print("Enter the file name to read: ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("\nFile Content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file name and path.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        }

        // 2. Arithmetic Operation (Division)
        try {
            System.out.print("\nEnter numerator: ");
            int num = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denom = scanner.nextInt();

            int result = num / denom;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
            scanner.nextLine(); // Clear the buffer
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // 3. Array Access
        int[] numbers = {10, 20, 30};
        try {
            System.out.print("\nEnter array index to access (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index.");
        }

        // 4. Null Pointer Handling
        String text = null;
        try {
            System.out.println("\nLength of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot perform operations on a null object.");
        }

        System.out.println("\nProgram completed successfully.");
        scanner.close();
    }
}
 */