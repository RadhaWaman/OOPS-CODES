// Rectangle class
class Rectangle {
    int length;
    int breadth;

    // Constructor using 'this' keyword
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to compare area with another rectangle
    void compareArea(Rectangle r) {
        int area1 = this.length * this.breadth;
        int area2 = r.length * r.breadth;

        if (area1 > area2) {
            System.out.println("Current rectangle has a larger area.");
        } else if (area1 < area2) {
            System.out.println("Given rectangle has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}

// MathOperations class
class MathOperations {
    // Static method to return square of a number
    static int square(int n) {
        return n * n;
    }

    // Instance method to return cube of a number
    int cube(int n) {
        return n * n * n;
    }
}

// Main class to test both functionalities
public class RectangleAndMathOp {
    public static void main(String[] args) {
        // Test Rectangle comparison
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(6, 3);
        rect1.compareArea(rect2);

        // Test MathOperations
        int num = 3;

        // Call static method
        int squareResult = MathOperations.square(num);
        System.out.println("Square of " + num + " is: " + squareResult);

        // Call instance method
        MathOperations mathOp = new MathOperations();
        int cubeResult = mathOp.cube(num);
        System.out.println("Cube of " + num + " is: " + cubeResult);
    }
}




/*
import java.util.Scanner;

// Rectangle class
class Rectangle {
    int length;
    int breadth;

    // Constructor using 'this' keyword
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to compare area with another rectangle
    void compareArea(Rectangle r) {
        int area1 = this.length * this.breadth;
        int area2 = r.length * r.breadth;

        if (area1 > area2) {
            System.out.println("Current rectangle has a larger area.");
        } else if (area1 < area2) {
            System.out.println("Given rectangle has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}

// MathOperations class
class MathOperations {
    // Static method to return square of a number
    static int square(int n) {
        return n * n;
    }

    // Instance method to return cube of a number
    int cube(int n) {
        return n * n * n;
    }
}

// Main class to test both functionalities
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Rectangle input ---
        System.out.println("Enter length and breadth of first rectangle:");
        int l1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        System.out.println("Enter length and breadth of second rectangle:");
        int l2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Rectangle rect1 = new Rectangle(l1, b1);
        Rectangle rect2 = new Rectangle(l2, b2);

        rect1.compareArea(rect2);

        // --- MathOperations input ---
        System.out.print("Enter a number to calculate square and cube: ");
        int num = scanner.nextInt();

        int squareResult = MathOperations.square(num);
        System.out.println("Square of " + num + " is: " + squareResult);

        MathOperations mathOp = new MathOperations();
        int cubeResult = mathOp.cube(num);
        System.out.println("Cube of " + num + " is: " + cubeResult);

        scanner.close();
    }
}
 */