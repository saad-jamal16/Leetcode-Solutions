class Solution {
    public int maxSubArray(int[] nums) {
        
        int current = nums[0];
        int sum = nums[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update current
            current = Math.max(nums[i], current + nums[i]);
            
            // Update sum if needed
            if (current > sum) {
                sum = current;
            }
        }
        
        // Return the global maximum sum
        return sum;
        
    }
}