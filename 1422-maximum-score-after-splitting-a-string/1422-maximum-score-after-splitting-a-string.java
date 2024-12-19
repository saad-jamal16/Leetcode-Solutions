class Solution {
    public int maxScore(String s) {
        int one  = 0;
        int max = 0;
        int zero = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                one++;
            }
        }
        for(int i = 0; i < n-1; i++){
            int sum  = 0;
            if(s.charAt(i) == '0'){
                zero++;
                sum = one + zero;
            }else{
                one--;
                sum = one + zero;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}