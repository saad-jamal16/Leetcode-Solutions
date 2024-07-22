class Solution {
    public int minimumOperations(int[] nums) {
        int operation = 0;
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            int remainder = nums[i] % 3;// here array of nums i will be divide by 3
            
            if(remainder == 1){
                operation += 1; // It takes 1 operation to make nums[i] divisible by 3
                                 // either subtract 1 or add 2
                
            }else if(remainder == 2){ // It takes 1 operation to make nums[i] divisible by 3
                                       // either add 1 or subtract 2
                operation += 1;
            }
            // if remainder is zero no operation is needed
        }
        return operation;
}
}