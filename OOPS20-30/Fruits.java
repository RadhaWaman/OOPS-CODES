// Base class Fruit
class Fruit {
    String name;
    String taste;
    String size;

    // Constructor for Fruit class to initialize attributes
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to print the name and taste of the fruit
    void eat() {
        System.out.println("Name of fruit is: " + name);
        System.out.println("Taste is: " + taste);
    }
}

// Subclass Apple inherits from Fruit
class Apple extends Fruit {
    
    // Constructor for Apple class
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Apples are sweet.");
    }
}

// Subclass Orange inherits from Fruit
class Orange extends Fruit {

    // Constructor for Orange class
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println("Oranges are tangy and sweet.");
    }
}

// Main class to test the implementation
public class Fruits {
    public static void main(String[] args) {

        // Create objects of Apple and Orange with specific attributes
        Fruit apple = new Apple("Apple", "Sweet", "Medium");
        Fruit orange = new Orange("Orange", "Tangy and Sweet", "Medium");

        // Call the eat method to display the fruit's taste
        apple.eat();
        orange.eat();
    }
}
