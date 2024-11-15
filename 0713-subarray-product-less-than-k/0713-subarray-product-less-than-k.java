class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int right = 0;
        int left = 0;
        int prod = 1;
        int count = 0;
        
        int n = nums.length;
        if (k <= 1) {
            return 0;
        }
        
        while (right < n) {
            prod *= nums[right];
            
            // Shrink the window until the product is less than k
            while (prod >= k && left <= right) {
                prod /= nums[left++];
            }
            
            // If the product is less than k, count the subarrays
            count += (right - left + 1);
            
            // Move the right pointer to the next element
            right++;
        }
        
        return count;
    }
}
    
