class Solution {
    public int findDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int count = 0;
        while(left <= right){
            int mid = left + (right - left)/2;
            count = 0;
            for(int num:nums){
                if(num <= mid){
                    count++;
                }
            }
            if(count <= mid){
                    left = mid+1;
                }else{
                    right = mid-1;
                }     
            }
     return left;   
    }
}