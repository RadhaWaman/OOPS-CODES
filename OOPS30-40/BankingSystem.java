// Custom exception class for Insufficient Funds
class InsufficientFundsException extends Exception {
    // Constructor accepting a custom error message
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Method to withdraw an amount
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // This line throws the custom exception if funds are insufficient
            throw new InsufficientFundsException("Insufficient funds! Withdrawal amount exceeds balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + balance);
        }
    }

    // Getter for balance (optional, for displaying the current balance)
    public double getBalance() {
        return balance;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000.0); // Initial balance of $1000

        // Try to withdraw different amounts using try-catch
        try {
            // Valid withdrawal
            account.withdraw(500.0); // Withdraw $500
            // Invalid withdrawal (more than the balance)
            account.withdraw(5000.0); // Try to withdraw $600, should throw exception
        } catch (InsufficientFundsException e) {
            // This block is executed when an InsufficientFundsException is thrown
            System.out.println("Error: " + e.getMessage());
        }

        // Final balance
        System.out.println("Final balance: $" + account.getBalance());
    }
}
