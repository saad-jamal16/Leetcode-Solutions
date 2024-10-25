class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlenwindow = Integer.MAX_VALUE;
        int currentsum = 0;
        //start two pointers 
        int low = 0;
        int high = 0;
        while(high < nums.length){
            //find the current sum and increment window size
            currentsum += nums[high];
            high++;
            // try to reduce the window size:
            while(currentsum >= target){
                int currentwindowsize = high-low;
                // update the minimum length of 
                minlenwindow = Math.min(minlenwindow,currentwindowsize);
                currentsum -= nums[low];
                low++;
            }
        }
        return minlenwindow == Integer.MAX_VALUE ? 0: minlenwindow;
    }
}