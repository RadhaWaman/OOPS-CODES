// Shape.java
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }

    void erase() {
        System.out.println("Erasing a shape.");
    }
}

// Circle.java
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    void erase() {
        System.out.println("Erasing a circle.");
    }
}

// Triangle.java
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle.");
    }

    @Override
    void erase() {
        System.out.println("Erasing a triangle.");
    }
}

// Square.java
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }

    @Override
    void erase() {
        System.out.println("Erasing a square.");
    }
}

// Main.java
public class PartB {
    public static void main(String[] args) {
        // Polymorphism: Using Shape reference to refer to subclass objects
        Shape s;

        s = new Circle();
        s.draw();
        s.erase();

        s = new Triangle();
        s.draw();
        s.erase();

        s = new Square();
        s.draw();
        s.erase();
    }
}
