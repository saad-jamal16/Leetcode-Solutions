class Solution {
    public int findLHS(int[] nums) {
        
        Arrays.sort(nums);
        int ans = 0; 
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            while( j < i && nums[i] - nums[j] > 1){
                j++;
        }
        if(nums[i] - nums[j] == 1){
            ans = Math.max(ans, i - j+1);
        }
        }
        return ans;
    }
}