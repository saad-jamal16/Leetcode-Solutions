class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);  // when array is sorted it will come in middle position
        int n = nums.length;  //size of array
        return nums[n/2];    //and then the middle position is divide by size of array
}
}
    