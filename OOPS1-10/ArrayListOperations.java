import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);

        // a. Traverse using for loop
        System.out.println("\nTraverse using for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // a. Traverse using iterator
        System.out.println("\nTraverse using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // a. Traverse using enhanced for-loop
        System.out.println("\nTraverse using enhanced for-loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // b. Check if an element exists
        String search = "Mango";
        if (fruits.contains(search)) {
            System.out.println("\n" + search + " is in the list.");
        } else {
            System.out.println("\n" + search + " is NOT in the list.");
        }

        // c. Add element at specific index
        fruits.add(2, "Pineapple"); // Adding at index 2
        System.out.println("\nList after adding 'Pineapple' at index 2:");
        System.out.println(fruits);
    }
}
