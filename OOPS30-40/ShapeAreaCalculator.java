// Shape Interface
interface Shape {
    double calculateArea();
}

// Circle class
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Area calculation for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Area calculation for Rectangle
    public double calculateArea() {
        return length * width;
    }
}

// Triangle class
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Area calculation for Triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        // Create objects for each shape
        Shape circle = new Circle(5);  // Circle with radius 5
        Shape rectangle = new Rectangle(4, 6);  // Rectangle with length 4, width 6
        Shape triangle = new Triangle(3, 7);  // Triangle with base 3, height 7

        // Calculate and print area for each shape
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
