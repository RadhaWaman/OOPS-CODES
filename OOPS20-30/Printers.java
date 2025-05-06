class Printer {
    String department;

    Printer(String department) {
        this.department = department;
    }

    // Synchronized method to avoid interruption
    synchronized void printNumbers() {
        System.out.println("Printing numbers for department: " + department);
        for (int i = 1; i <= 10; i++) {
            System.out.println(department + " - " + i);
            try {
                Thread.sleep(500); // 0.5 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Thread class that uses Printer
class PrinterTask extends Thread {
    Printer printer;

    PrinterTask(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printNumbers();
    }
}

// Main class
public class Printers {
    public static void main(String[] args) {
        // Creating two Printer objects with different departments
        Printer printer1 = new Printer("HR");
        Printer printer2 = new Printer("IT");

        // Creating two threads
        Thread t1 = new PrinterTask(printer1);
        Thread t2 = new PrinterTask(printer2);

        // Start the threads
        t1.start();
        t2.start();
    }
}
