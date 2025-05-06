// Employee.java
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }

    double getSalary() {
        return 30000.0; // base salary
    }
}

// HRManager.java
class HRManager extends Employee {
    // Overriding the work() method
    @Override
    void work() {
        System.out.println("HR Manager is recruiting new employees.");
    }

    // New method in HRManager
    void addEmployee() {
        System.out.println("New employee has been added to the system.");
    }
}

// Main.java
public class PartA {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        
        // Calls overridden work method
        hr.work(); 
        
        // Calls inherited getSalary method
        System.out.println("Salary: " + hr.getSalary()); 
        
        // Calls HR-specific method
        hr.addEmployee(); 
    }
}
