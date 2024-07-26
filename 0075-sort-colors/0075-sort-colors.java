class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;  // declared all the colors as 0 so that i can use them for storing arrays
        int blue = 0;
        
        for(int i = 0; i < nums.length; i++){  
            if(nums[i] == 0){
                red++;           //if nums element  will be zero red conunter will be incremented
            } else if (nums[i] == 1){
                white++;
            } else{
                blue++; //After this loop, the variables red, white, and blue will hold the counts of 0s, 1s, and 2s
            }
        }
        // this loop is iterated to sort the arrays:
        
        for(int j = 0; j < nums.length; j++){
            if(red > 0){     // if red is greater then 0 then there are still 0's left
                nums[j] = 0;
                red--;        // so if there it will bring it in sorted form.
            } else if( white > 0){
                nums[j] = 1;
                white--;
            } else{
                nums[j] = 2;
                blue--;
            }
        }
        
    }
}