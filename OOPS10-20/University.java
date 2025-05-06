import java.util.*;

// Base class
class Staff {
    String name;
    double salary;

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    double calculateBonus() {
        return 0; // Base class has no bonus
    }

    void promote() {
        System.out.println("Promotion policy for general staff.");
    }
}

// Professor subclass
class Professor extends Staff {
    String subject;

    Professor(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Professor: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // 20% bonus
    }

    @Override
    void promote() {
        System.out.println(name + " is promoted to Senior Professor.");
    }
}

// AdministrativeStaff subclass
class AdministrativeStaff extends Staff {
    String department;

    AdministrativeStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void displayDetails() {
        System.out.println("Admin Staff: " + name + ", Department: " + department + ", Salary: " + salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    @Override
    void promote() {
        System.out.println(name + " is promoted to Senior Admin Officer.");
    }
}

// MaintenanceStaff subclass
class MaintenanceStaff extends Staff {
    String shift;

    MaintenanceStaff(String name, double salary, String shift) {
        super(name, salary);
        this.shift = shift;
    }

    @Override
    void displayDetails() {
        System.out.println("Maintenance Staff: " + name + ", Shift: " + shift + ", Salary: " + salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.05; // 5% bonus
    }

    @Override
    void promote() {
        System.out.println(name + " is promoted to Supervisor.");
    }
}

// Main class
public class University {
    public static void main(String[] args) {
        // List of base class references
        List<Staff> staffList = new ArrayList<>();

        staffList.add(new Professor("Dr. Ahuja", 90000, "AI & ML"));
        staffList.add(new AdministrativeStaff("Mr. Mehta", 50000, "Admissions"));
        staffList.add(new MaintenanceStaff("Ravi", 30000, "Night"));

        // Polymorphic behavior
        for (Staff staff : staffList) {
            staff.displayDetails();
            System.out.println("Bonus: " + staff.calculateBonus());
            staff.promote();
            System.out.println("------------------------");
        }
    }
}
