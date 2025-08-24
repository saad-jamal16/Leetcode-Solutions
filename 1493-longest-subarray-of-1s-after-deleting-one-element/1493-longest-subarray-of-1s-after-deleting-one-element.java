class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l = 0;
        
        int count = 0;
        int maxLen = 0;
        for(int r = 0; r < n; r++){
            if(nums[r] == 0){
                count++;
            }

            while(l <= r && count > 1){
                if(nums[l] == 0){
                    count--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen - 1;

    }
}