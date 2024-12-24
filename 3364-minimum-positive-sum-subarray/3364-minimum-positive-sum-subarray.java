class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
         int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        
        // Create prefix sum array
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;
        
        // Calculate prefix sum
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums.get(i);
        }
        
        // Check all possible window sizes from l to r
        for (int len = l; len <= r; len++) {
            // Slide window of current length
            for (int i = 0; i + len <= n; i++) {
                int sum = prefixSum[i + len] - prefixSum[i];
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }
        
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}