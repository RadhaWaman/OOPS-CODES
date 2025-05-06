// Vehicle interface
interface Vehicle {
    void startRide();
    void endRide();
    int calculateFare(int distance);
}

// PricingStrategy interface
interface PricingStrategy {
    int adjustFare(int baseFare);
}

// PeakHourStrategy
class PeakHourStrategy implements PricingStrategy {
    public int adjustFare(int baseFare) {
        return baseFare + (baseFare * 20 / 100); // 20% extra
    }
}

// HolidayStrategy
class HolidayStrategy implements PricingStrategy {
    public int adjustFare(int baseFare) {
        return baseFare + 50; // flat ₹50 extra
    }
}

// No Extra Charges
class NormalStrategy implements PricingStrategy {
    public int adjustFare(int baseFare) {
        return baseFare; // no change
    }
}

// Bike class
class Bike implements Vehicle {
    PricingStrategy strategy;

    public Bike(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void startRide() {
        System.out.println("Bike ride started.");
    }

    public void endRide() {
        System.out.println("Bike ride ended.");
    }

    public int calculateFare(int distance) {
        int baseFare = distance * 5;
        return strategy.adjustFare(baseFare);
    }
}

// Auto class
class Auto implements Vehicle {
    PricingStrategy strategy;

    public Auto(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void startRide() {
        System.out.println("Auto ride started.");
    }

    public void endRide() {
        System.out.println("Auto ride ended.");
    }

    public int calculateFare(int distance) {
        int baseFare = distance * 8;
        return strategy.adjustFare(baseFare);
    }
}

// Cab class
class Cab implements Vehicle {
    PricingStrategy strategy;

    public Cab(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void startRide() {
        System.out.println("Cab ride started.");
    }

    public void endRide() {
        System.out.println("Cab ride ended.");
    }

    public int calculateFare(int distance) {
        int baseFare = distance * 12;
        return strategy.adjustFare(baseFare);
    }
}

// Main class
public class RideSystem {
    public static void main(String[] args) {
        Vehicle bike = new Bike(new PeakHourStrategy());
        Vehicle auto = new Auto(new HolidayStrategy());
        Vehicle cab = new Cab(new NormalStrategy());

        bike.startRide();
        System.out.println("Bike Fare: ₹" + bike.calculateFare(10));
        bike.endRide();

        auto.startRide();
        System.out.println("Auto Fare: ₹" + auto.calculateFare(10));
        auto.endRide();

        cab.startRide();
        System.out.println("Cab Fare: ₹" + cab.calculateFare(10));
        cab.endRide();
    }
}
