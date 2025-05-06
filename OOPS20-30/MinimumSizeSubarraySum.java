public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum solver = new MinimumSizeSubarraySum();

        // Example 1
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        System.out.println("Output: " + solver.minSubArrayLen(target1, nums1)); // Output: 2

        // Example 2
        int[] nums2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target2 = 11;
        System.out.println("Output: " + solver.minSubArrayLen(target2, nums2)); // Output: 0
    }
}
