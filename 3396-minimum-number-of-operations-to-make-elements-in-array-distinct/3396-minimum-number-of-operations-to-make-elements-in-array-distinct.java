class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = n-1; i >= 0; i--){
            if(set.contains(nums[i])){
                return i / 3 + 1;
            }
            set.add(nums[i]);
        }
        return 0;
    }
}