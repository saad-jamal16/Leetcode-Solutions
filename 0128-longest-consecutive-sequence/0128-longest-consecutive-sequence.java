class Solution {
    public int longestConsecutive(int[] nums) {
       
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums); // Sort the array to bring all consecutive numbers next to each other
        
        int longestConsecutive = 1; // Will keep track of the longest sequence found so far
        int currentConsecutive = 1; // Will keep track of the current consecutive sequence length
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentConsecutive++;
                } else {
                    longestConsecutive = Math.max(longestConsecutive, currentConsecutive);
                    currentConsecutive = 1; // Reset for a new sequence
                }
            }
        }
        
        // Final check to ensure the longest streak is considered
        return Math.max(longestConsecutive, currentConsecutive);

    }
}