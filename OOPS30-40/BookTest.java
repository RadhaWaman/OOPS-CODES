// Class definition for Book
class Book {
    // Instance variables
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Constructor with title and author as parameters
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;  // Default price if not provided
    }

    // Constructor with title, author, and price as parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to print book details
    public void printBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("----------------------------");
    }
}

// Main class to test the Book class
public class BookTest {
    public static void main(String[] args) {
        // Creating objects using different constructors

        // Using the default constructor
        Book book1 = new Book();
        System.out.println("Using default constructor:");
        book1.printBookDetails();

        // Using the constructor with title and author
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Using constructor with title and author:");
        book2.printBookDetails();

        // Using the constructor with title, author, and price
        Book book3 = new Book("1984", "George Orwell", 12.99);
        System.out.println("Using constructor with title, author, and price:");
        book3.printBookDetails();
    }
}
