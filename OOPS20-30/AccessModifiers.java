// Base class
class Person {
    private String name;           // Private
    public int age;                // Public
    protected String address;      // Protected
    String phoneNumber;           // Default (package-private)

    // Constructor to initialize all attributes
    public Person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Public method to display name, age, and address
    public void displayDetails() {
        System.out.println("Name: " + name);  // Accessing private attribute inside class
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Public method to update phone number
    public void updatePhoneNumber(String newNumber) {
        phoneNumber = newNumber;
    }
}

// Derived class
class Employee extends Person {
    public String employeeId;  // Public attribute

    // Constructor
    public Employee(String name, int age, String address, String phoneNumber, String employeeId) {
        super(name, age, address, phoneNumber);
        this.employeeId = employeeId;
    }

    // Override displayDetails method to include employeeId
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent display
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main class
public class AccessModifiers {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice", 30, "Pune", "9876543210", "EMP123");

        // Accessing public method
        emp.displayDetails();

        // Accessing and updating public field
        emp.age = 31;
        System.out.println("Updated Age: " + emp.age);

        // Updating phone number using public method
        emp.updatePhoneNumber("9998887776");

        // Accessing protected field (allowed since Employee is a subclass)
        System.out.println("Protected Address: " + emp.address);

        // Accessing default (package-private) field
        System.out.println("Default Phone Number: " + emp.phoneNumber);

        // ❌ The following would give error because `name` is private:
        // System.out.println(emp.name); // Not allowed
    }
}
