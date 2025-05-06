import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

    // Part A: Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // ---------------- PART A ----------------
        System.out.println("Part A: Remove Prime Numbers from 1 to 25\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            numbers.add(i);
        }

        // Remove prime numbers using Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (isPrime(num)) {
                iterator.remove();
            }
        }

        System.out.println("ArrayList after removing prime numbers: " + numbers);

        // ---------------- PART B ----------------
        System.out.println("\nPart B: ArrayList Operations\n");

        // a. Create ArrayList and traverse using:
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // i. for-loop
        System.out.println("Traverse using for-loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // ii. Iterator
        System.out.println("\nTraverse using Iterator:");
        Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            System.out.println(fruitIterator.next());
        }

        // iii. Enhanced for-loop
        System.out.println("\nTraverse using enhanced for-loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // b. Check if element exists
        String searchFruit = "Banana";
        if (fruits.contains(searchFruit)) {
            System.out.println("\nElement '" + searchFruit + "' exists in the ArrayList.");
        } else {
            System.out.println("\nElement '" + searchFruit + "' does not exist in the ArrayList.");
        }

        // c. Add element at particular index
        fruits.add(2, "Mango"); // adding Mango at index 2
        System.out.println("\nArrayList after adding 'Mango' at index 2:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
