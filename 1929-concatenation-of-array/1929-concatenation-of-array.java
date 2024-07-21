class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i = 0; i < n; i++){ //iterating through input array nums
            ans[i] = nums[i]; //Fill the first half
            ans[i + n] = nums[i];  //Fill the 2nd half
        }
        return ans;
}
}