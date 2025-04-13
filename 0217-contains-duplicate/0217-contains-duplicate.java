class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> box = new HashSet<>();
        for(int num : nums){
            if(box.contains(num)){
                return true;
            }
            box.add(num);
        }
        return false;
    }
}