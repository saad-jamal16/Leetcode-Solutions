class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; // If k is 0 or 1, no product can be less than k.

        int count = 0;
        int product = 1; // Initialize prefix product
        int left = 0; // Sliding window's left pointer

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right]; // Include nums[right] in the product

            // Shrink the window until the product is less than k
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            // All subarrays ending at `right` with a start between `left` and `right` are valid
            count += (right - left + 1);
        }

        return count;
    }
}