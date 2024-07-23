class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;   // Initailized count 0 so that it can check from 0 till n
        
        int n = nums.length;
        
        for(int i=0; i<n; i++){  //iterated till nums.length
            
            for(int j=0; j<i; j++){   //iterated j less then i 
                if(nums[i] == nums[j]){ //condition
                    count++; //
                }
                }
            }
        return count;
    
    }
}