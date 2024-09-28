class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] res = new int [nums.length - k + 1];
        int j = 0;
        // consider 3 element in one window
        // and search for the larger item in all 3 elements
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int  i = 0; i < nums.length; i++){
            while(!queue.isEmpty() && nums[queue.getLast()] < nums[i]){
                queue.removeLast();
            }
            queue.addLast(i);
            if(queue.getFirst() + k == i){
                queue.removeFirst();
            }
            //if( k = -1) = 2
            if( i >= k - 1 ){
                res[j++] = nums[queue.getFirst()];
            }
        }
        return res;
        
    }
}