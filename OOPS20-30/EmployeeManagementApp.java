import java.util.ArrayList;

// Employee class
class Employeee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    // Constructor
    public Employeee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Method to print employee details
    public void getEmployeeDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: Rs. " + salary);
    }
}

// EmployeeDB class
class EmployeeDB {
    ArrayList<Employeee> list = new ArrayList<>();

    // Add an employee
    public boolean addEmployee(Employeee e) {
        return list.add(e);
    }

    // Delete an employee by ID
    public boolean deleteEmployee(int empId) {
        for (Employeee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    // Show pay slip
    public String showPaySlip(int empId) {
        for (Employeee e : list) {
            if (e.empId == empId) {
                return "PaySlip for Employee ID " + empId + ": Rs. " + e.salary;
            }
        }
        return "Employee not found.";
    }
}

// Main class
public class EmployeeManagementApp {
    public static void main(String[] args) {
        // Create Employee objects
        Employeee e1 = new Employeee(101, "Alice", "alice@example.com", "Female", 50000f);
        Employeee e2 = new Employeee(102, "Bob", "bob@example.com", "Male", 60000f);

        // Create the database
        EmployeeDB db = new EmployeeDB();

        // Add employees
        db.addEmployee(e1);
        db.addEmployee(e2);

        // Display employee details
        System.out.println("\nEmployee Details:");
        e1.getEmployeeDetails();
        System.out.println();
        e2.getEmployeeDetails();

        // Show payslip
        System.out.println("\n" + db.showPaySlip(101));

        // Delete employee
        boolean deleted = db.deleteEmployee(102);
        System.out.println("\nEmployee 102 deleted: " + deleted);

        // Try showing payslip for deleted employee
        System.out.println(db.showPaySlip(102));
    }
}
