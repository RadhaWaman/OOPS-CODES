import java.util.ArrayList;
import java.util.Iterator;

public class RemovePrimes {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1){ 
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0){

             return false; 
            }

        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add numbers from 1 to 25
        for (int i = 1; i <= 25; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        // Use iterator to remove prime numbers
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) {
                it.remove();
            }
        }

        System.out.println("After removing prime numbers: " + numbers);
    }
}
 