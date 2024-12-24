class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[i-1] + nums[i];
        }
        int prefix = sum[nums.length-1];
        for(int i = 0; i < nums.length; i++){
            if(prefix-sum[i] == sum[i] - nums[i]){
                return i;
            }
        }
        return -1;
    }
}