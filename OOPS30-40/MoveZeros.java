public class MoveZeros {
    public static void moveZeroesToEnd(int[] arr) {
        int count = 0; // Index to keep track of non-zero elements

        // Step 1: Copy all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println("Before:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        moveZeroesToEnd(arr);

        System.out.println("\nAfter:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
 