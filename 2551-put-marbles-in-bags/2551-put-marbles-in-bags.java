class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if(k == 1) return 0;
        int [] pair = new int[n-1];
        for(int i = 0; i < n-1; i++){
            pair[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(pair);
        long minScore = 0, maxScore = 0;
        for(int i = 0; i < k-1; i++){
            minScore += pair[i];
            maxScore += pair[n-2-i];
        }
        return maxScore - minScore;
    }
}