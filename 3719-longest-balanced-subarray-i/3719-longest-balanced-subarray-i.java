class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        for(int i = 0; i < n; i++){
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for(int j = i; j < n; j++){
                int num = nums[j];

                if(num % 2 == 0){
                    evenSet.add(num);
                }else{
                    oddSet.add(num);
                }
                if(evenSet.size() == oddSet.size() && evenSet.size() > 0){
                    maxLength = Math.max(maxLength,j - i + 1);
                }
            }
        }
        return maxLength;
    }
}