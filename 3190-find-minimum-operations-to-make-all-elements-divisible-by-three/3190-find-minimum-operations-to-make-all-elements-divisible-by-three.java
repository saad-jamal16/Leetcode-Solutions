class Solution {
    public int minimumOperations(int[] nums) {
        int operation = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int remainder = nums[i] % 3;
            if(remainder  == 1){
                operation += 1;
            }
            else if(remainder == 2){
                operation += 1;
            }
        }
        return operation;
        
    }
}