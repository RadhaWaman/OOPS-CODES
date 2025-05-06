import java.util.Scanner;

public class GCDAndDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for GCD calculation
        System.out.print("Enter first number for GCD: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number for GCD: ");
        int b = scanner.nextInt();

        // Calculate GCD
        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

        // Input for Decimal to Binary conversion
        System.out.print("Enter a decimal number to convert to binary: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary manually
        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);

        scanner.close();
    }

    // Euclidean algorithm to find GCD
    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Manual method to convert decimal to binary
    static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();

        // Edge case when number is 0
        if (num == 0) {
            binary.append("0");
        } else {
            while (num > 0) {
                binary.insert(0, num % 2); // Insert the remainder (0 or 1) at the start
                num = num / 2; // Update the number by dividing it by 2
            }
        }

        return binary.toString();
    }
}
