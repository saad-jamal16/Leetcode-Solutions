class Solution {
    public int minDistance(String word1, String word2) {
        
        int n = word1.length();
        int m= word2.length();

        int [][] dp = new int [n][m];
        for(int [] i: dp) Arrays.fill(i,-1);

        return solve(n-1,m-1,word1,word2,dp);                
    }
    int solve (int n, int m, String word1, String word2, int [][]dp){

        if(n<0) return m+1;
        if(m<0) return n+1;
        
        if(dp[n][m]!=-1) return dp[n][m];

        if(word1.charAt(n)==word2.charAt(m)){
            return dp[n][m] = solve(n-1,m-1,word1,word2,dp);// if word1 and word2 are same no operation is required to convert
        }
        int insert = solve(n,m-1,word1,word2,dp);
        int delete = solve(n-1,m,word1,word2,dp);
        int replace = solve(n-1,m-1,word1,word2,dp);

        return dp[n][m] =1+ Math.min(insert,Math.min(delete,replace)); // if words are different "1" operation is required and how many more is recursively calculated
    
    }
}