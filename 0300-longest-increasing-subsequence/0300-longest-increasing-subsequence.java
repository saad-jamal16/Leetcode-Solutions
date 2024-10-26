class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] sub = new int[nums.length];
        int length = 0;

        for (int num : nums) {
            int pos = binarySearch(sub, 0, length, num);
            
            // If num is greater than all elements in sub, append it
            if (pos == length) {
                sub[length++] = num;
            } else {
                // Replace to maintain the smallest end value
                sub[pos] = num;
            }
        }
        return length;
    }

    private int binarySearch(int[] sub, int left, int right, int target) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sub[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
    
