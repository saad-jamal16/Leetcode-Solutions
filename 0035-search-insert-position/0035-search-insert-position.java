class Solution {
    public int searchInsert(int[] nums, int target) {
           int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;   // if found, return index
            }
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // if not found, the insert position will be retained by 'lo'
        // WHY and HOW? Watch my video!
        return left;  
    }
}