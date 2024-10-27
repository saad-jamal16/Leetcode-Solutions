class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for(int num : nums) right = Math.max(num,right);
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int total = 0;
            for(int num : nums) {
                total += (num + mid - 1) / mid;
            }
            if(total > threshold) {
                left = mid + 1;
            }
            else {
            right = mid - 1;
            }
        }
        return left;
    }
}