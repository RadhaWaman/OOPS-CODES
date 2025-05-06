public class CarAssembly implements Runnable {
    // Private fields
    private String componentName;
    private int timeToPrepare;

    // Constructor
    public CarAssembly(String componentName, int timeToPrepare) {
        this.componentName = componentName;
        this.timeToPrepare = timeToPrepare;
    }

    // Run method
    @Override
    public void run() {
        try {
            // Simulate preparation time with sleep
            System.out.println(componentName + " is preparing");
            Thread.sleep(timeToPrepare);
            System.out.println(componentName + " is ready");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create CarAssembly objects for different components
        CarAssembly engine = new CarAssembly("Engine", 3000);
        CarAssembly body = new CarAssembly("Body", 4000);
        CarAssembly wheels = new CarAssembly("Wheels", 5000);

        // Create threads for each component
        Thread engineThread = new Thread(engine);
        Thread bodyThread = new Thread(body);
        Thread wheelThread = new Thread(wheels);

        // Start the threads
        engineThread.start();
        bodyThread.start();
        wheelThread.start();

        try {
            // Use join to synchronize the threads (ensure each part is ready before the next starts)
            engineThread.join();
            bodyThread.join();
            wheelThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Car assembly completed!");
    }
}
