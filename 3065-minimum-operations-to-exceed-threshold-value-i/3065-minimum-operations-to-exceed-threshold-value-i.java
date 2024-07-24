class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;       // iniliazing  counter from 0
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < k){   // comparing all arrays of nums which are less then k.
                count++;
            }   
        }
        return count;
        
    }
}