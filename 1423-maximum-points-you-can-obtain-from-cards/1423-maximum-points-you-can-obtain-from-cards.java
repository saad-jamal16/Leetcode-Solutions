class Solution {
    public int maxScore(int[] cardPoints, int k) {
         int n = cardPoints.length;
        int left = 0, right = cardPoints.length - k;

        int currSum = 0;

        for (int i = right; i < n; i++)
            currSum += cardPoints[i];

        int maxSum = currSum;

        while (right < n) {
            currSum += (cardPoints[left++] - cardPoints[right++]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}