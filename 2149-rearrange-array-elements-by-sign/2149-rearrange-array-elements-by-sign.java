class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
        int pos = 0;  //pos is initialized to 0. This means the first positive number should be placed at index 0.
        
        int neg = 1;  //neg is initialized to 1. This means the first negative number should be placed at index 1
        
        int [] ans = new int[n];  // just created ans array so that i can store array inside it
        
        for(int i = 0; i < n; i++){   //iterated loop till nums length
            if(nums[i] > 0){          //if nums array is less then zero 
                ans[pos] = nums[i];    // put positive integer on array ans
                
                pos += 2;   //pos and neg are incremented by 2 to ensure that positive and negative numbers are placed                             in alternate positions. For example, positive numbers will be placed at indices 0, 2, 4
            }
            else{
                ans[neg] = nums[i];
                    neg += 2;
            }
        }
        return ans;
    }
}