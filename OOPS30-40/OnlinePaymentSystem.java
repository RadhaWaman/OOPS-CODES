// Abstract Payment Class
abstract class Payment {
    double amount;
    String transactionID;

    public Payment(double amount, String transactionID) {
        this.amount = amount;
        this.transactionID = transactionID;
    }

    // Abstract method
    public abstract void processPayment();

    // Concrete method
    public void showTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: $" + amount);
    }
}

// Credit Card Payment
class CreditCardPayment extends Payment {
    String cardNumber;

    public CreditCardPayment(double amount, String transactionID, String cardNumber) {
        super(amount, transactionID);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card payment...");
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        showTransactionDetails();
    }
}

// PayPal Payment
class PayPalPayment extends Payment {
    String email;

    public PayPalPayment(double amount, String transactionID, String email) {
        super(amount, transactionID);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal Email: " + email);
        showTransactionDetails();
    }
}

// UPI Payment
class UPIPayment extends Payment {
    String upiID;

    public UPIPayment(double amount, String transactionID, String upiID) {
        super(amount, transactionID);
        this.upiID = upiID;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiID);
        showTransactionDetails();
    }
}

// Payment Gateway
class PaymentGateway {
    public void processTransaction(Payment payment) {
        payment.processPayment();
        System.out.println("Payment successful!\n");
    }
}

// Main Class
public class OnlinePaymentSystem {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();

        // Create different payment types
        Payment creditCard = new CreditCardPayment(150.75, "TXN1001", "1234567812345678");
        Payment paypal = new PayPalPayment(99.99, "TXN1002", "user@example.com");
        Payment upi = new UPIPayment(50.00, "TXN1003", "user@upi");

        // Process transactions
        gateway.processTransaction(creditCard);
        gateway.processTransaction(paypal);
        gateway.processTransaction(upi);
    }
}
