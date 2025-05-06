// Custom Exception class for non-eligibility
class NonEligibleException extends Exception {
    public NonEligibleException(String message) {
        super(message); // Pass the message to the parent exception class
    }
}

// Citizen class with necessary attributes
class Citizen {
    private String name;
    private int id;
    private String country;
    private String sex;
    private String maritalStatus;
    private double annualIncome;
    private String economyStatus;
    private int age;

    // Constructor to initialize Citizen object
    public Citizen(String name, int id, String country, String sex, String maritalStatus, double annualIncome, String economyStatus, int age) {
        this.name = name;
        this.id = id;
        this.country = country;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.annualIncome = annualIncome;
        this.economyStatus = economyStatus;
        this.age = age;
    }

    // Method to check eligibility based on age and country
    public void checkEligibility() throws NonEligibleException {
        // Check if age is below 18 and country is not 'India'
        if (age < 18 && !country.equalsIgnoreCase("India")) {
            throw new NonEligibleException("Citizen is not eligible. Age below 18 and country is not India.");
        }
    }

    // Overriding toString method to display the citizen details in proper format
    @Override
    public String toString() {
        return "Citizen [Name: " + name + ", ID: " + id + ", Country: " + country + ", Sex: " + sex + ", Marital Status: " + maritalStatus +
                ", Annual Income: " + annualIncome + ", Economy Status: " + economyStatus + ", Age: " + age + "]";
    }
}

// Main class to test the Citizen and exception
public class CitizenTest {
    public static void main(String[] args) {
        // Creating a Citizen object
        Citizen citizen = new Citizen("John Doe", 12345, "USA", "Male", "Single", 50000.0, "Middle-Class", 17);

        // Try to validate eligibility and print the Citizen details
        try {
            citizen.checkEligibility(); // This will throw exception if invalid
            System.out.println(citizen.toString()); // Display the citizen details
        } catch (NonEligibleException e) {
            System.out.println(e.getMessage()); // Print exception message
        }
    }
}
