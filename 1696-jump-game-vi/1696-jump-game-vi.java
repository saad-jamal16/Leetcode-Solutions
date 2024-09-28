class Solution {
    public int maxResult(int[] nums, int k) {
        
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        pq.offer(new int [] {nums[0],0});
        int max = nums[0];
        // we have already added  0  to value in queue so will start from 1
        for(int  i = 1; i < nums.length; i++){
            while(pq.peek()[1] < i-k){
                pq.poll();
            }
            int [] cur = pq.peek();
            // we will be adding the value
            max = cur[0]+ nums[i];
            pq.offer(new int[]{cur[0]+nums[i],i});
        }
        return max;
        
    }
}