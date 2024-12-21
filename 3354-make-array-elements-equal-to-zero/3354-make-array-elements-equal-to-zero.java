class Solution {
    public int countValidSelections(int[] nums) {
         int n = nums.length;
        int selections = 0;

        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        // Build prefix sums
        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];

        // Build suffix sums
        for (int i = n - 2; i >= 0; --i)
            suffixSum[i] = suffixSum[i + 1] + nums[i + 1];

        for (int i = 0; i < n; ++i) {
            if (nums[i] != 0)
                continue;

            // Both sides equal zero at the same time
            if (prefixSum[i] == suffixSum[i])
                selections += 2;

            // Only one side equals zero at the end
            if (Math.abs(prefixSum[i] - suffixSum[i]) == 1)
                selections += 1;
        }

        return selections;
    }
}