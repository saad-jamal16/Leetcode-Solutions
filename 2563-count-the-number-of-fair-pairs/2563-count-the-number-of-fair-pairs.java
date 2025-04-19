import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums); 
        int n = nums.length;

        long countPairsWithin = 0;
        long countPairsBelow = 0;

        // Count pairs with sum <= upper
        int left = 0, right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] <= upper) {
                countPairsWithin += (right - left);
                left++;
            } else {
                right--;
            }
        }

        // Count pairs with sum < lower
        left = 0;
        right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] <= lower - 1) {
                countPairsBelow += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return countPairsWithin - countPairsBelow;
    }
}