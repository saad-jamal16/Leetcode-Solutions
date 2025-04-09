class Solution {
    public int minOperations(int[] nums, int k) {
        for(num : nums){
            if(nums < k) return -1;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(nums > k) set.add(num);
        }
        return set.size;
    }
}