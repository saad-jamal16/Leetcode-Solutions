class Solution {
    public int searchInsert(int[] nums, int target) {
         int i = 0;
        // go as long as we are < target
        while (i < nums.length && nums[i] < target) {
            i++;
        }
        // `i` will retain the insert position
        // or the index of target, if found
        return i;   
    }
}