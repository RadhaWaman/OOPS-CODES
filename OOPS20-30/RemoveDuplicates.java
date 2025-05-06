public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }
        
        int i = 0; // Pointer to track the last unique element's index
        
        for (int j = 1; j < nums.length; j++) {
            // If we find a unique element
            if (nums[j] != nums[i]) {
                i++; // Move the pointer to the next unique element's position
                nums[i] = nums[j]; // Update the unique element at nums[i]
            }
        }
        
        // Return the length of the array after removing duplicates
        return i + 1; 
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        
        // Remove duplicates and get the new length
        int newLength = removeDuplicates(nums);
        
        // Print the new length
        System.out.println("New length: " + newLength);
        
        // Print the modified array (first part with unique elements)
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        
        // Optionally, print underscores for the rest of the array
        for (int i = newLength; i < nums.length; i++) {
            System.out.print("_ ");
        }
    }
}
