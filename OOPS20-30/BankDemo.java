class BankAccounts {
    String accountNumber;
    double balance;

    // Constructor
    BankAccounts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new ArithmeticException("Not enough balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful.");
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        BankAccounts myAccount = new BankAccounts("ACC123", 1000.0);

        // First attempt: invalid (negative amount)
        try {
            myAccount.withdraw(-200);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal amount.");
        } catch (ArithmeticException e) {
            System.out.println("Insufficient funds for withdrawal.");
        }
        myAccount.displayBalance();

        // Second attempt: invalid (exceeds balance)
        try {
            myAccount.withdraw(1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal amount.");
        } catch (ArithmeticException e) {
            System.out.println("Insufficient funds for withdrawal.");
        }
        myAccount.displayBalance();

        // Third attempt: valid withdrawal
        try {
            myAccount.withdraw(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid withdrawal amount.");
        } catch (ArithmeticException e) {
            System.out.println("Insufficient funds for withdrawal.");
        }
        myAccount.displayBalance();
    }
}
