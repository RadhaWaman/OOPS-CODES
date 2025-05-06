import java.util.Arrays;

public class ArrayOperations {

    // Function to find the largest and smallest elements in an array
    public static void findLargestAndSmallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }

    // Function to reverse an array in place
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }

    // Function to merge two arrays into a single sorted array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] mergedArray = new int[n];

        // Copy elements of arr1 and arr2 into the merged array
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        // Sort the merged array
        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        // Sample arrays for testing
        int[] arr1 = {10, 5, 3, 12, 7};
        int[] arr2 = {4, 8, 1, 6, 2};

        // Task 1: Find the largest and smallest elements
        findLargestAndSmallest(arr1);

        // Task 2: Reverse the array
        reverseArray(arr1);
        System.out.println("Reversed array: " + Arrays.toString(arr1));

        // Task 3: Merge two arrays and display the sorted array
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }
}




/*
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    // Function to find the largest and smallest elements in an array
    public static void findLargestAndSmallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }

    // Function to reverse an array in place
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }

    // Function to merge two arrays into a single sorted array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length + arr2.length;
        int[] mergedArray = new int[n];

        // Copy elements of arr1 and arr2 into the merged array
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        // Sort the merged array
        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 1: Get user input for array 1
        System.out.println("Enter the number of elements for Array 1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements for Array 1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Task 2: Get user input for array 2
        System.out.println("Enter the number of elements for Array 2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements for Array 2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Task 3: Find the largest and smallest elements
        findLargestAndSmallest(arr1);

        // Task 4: Reverse the array
        reverseArray(arr1);
        System.out.println("Reversed Array 1: " + Arrays.toString(arr1));

        // Task 5: Merge two arrays and display the sorted array
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
        
        scanner.close();  // Close the scanner to avoid resource leak
    }
}
 */