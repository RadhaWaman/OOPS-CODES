// Abstract class Shape
abstract class Shapee {
    // Abstract methods
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Circle class extending Shape
class Circlee extends Shapee {
    double radius;

    // Constructor
    Circlee(double radius) {
        this.radius = radius;
    }

    // Implementing abstract methods
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class extending Shape
class Trianglee extends Shapee {
    double sideA, sideB, sideC;

    // Constructor
    Trianglee(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    // Implementing abstract methods
    @Override
    double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Heron's formula
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

// Main class
public class CircleTriangle {
    public static void main(String[] args) {
        // Create a Circle object
        Shapee circle = new Circlee(5); // Radius = 5
        System.out.println("Circle:");
        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Perimeter = " + circle.calculatePerimeter());

        System.out.println();

        // Create a Triangle object
        Shapee triangle = new Trianglee(3, 4, 5); // Sides: 3, 4, 5
        System.out.println("Triangle:");
        System.out.println("Area = " + triangle.calculateArea());
        System.out.println("Perimeter = " + triangle.calculatePerimeter());
    }
}
