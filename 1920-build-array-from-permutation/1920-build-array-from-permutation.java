class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length; // assigned n to length of nums
        int []ans = new int[n]; // created array ans as told
        for(int i=0; i<n; i++){  //iterated loop from 0 to nums.length
            ans[i] = nums[nums[i]]; // assigned ans to nums array of i
        }
        return ans; //returned ans
    }
}