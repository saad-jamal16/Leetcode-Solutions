class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] result = new int[2 * n];
        for(int i=0; i<n*2; i++){ //iterating each time till n*2
            if(i % 2 == 0){ //see I am considering every pair of x1,y1, as odd and even
                result[i] = nums[i/2]; //so every nums array of i is divisible by 2
            }else{
                result[i] = nums[n+ i/2];
            }
        }
        return result;     
}
}