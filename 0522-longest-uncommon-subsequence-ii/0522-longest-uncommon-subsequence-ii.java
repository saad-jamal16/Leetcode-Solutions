class Solution {
    public int findLUSlength(String[] strs) {
         int ans = -1 ;
        for (int i = 0; i < strs.length; i++) {
            boolean is_sub = false ; 
            for (int j = 0; j < strs.length; j++) {
                if(is_sub) break ; 
                if(j==i || strs[i].length()> strs[j].length()) continue;
                int x = helper(strs[i] , strs[j]) ; 
                if(x == -1) {
                    is_sub = true ; 
                }
                
            }
            if(! is_sub) ans = Math.max(ans , strs[i].length()) ; 
        }
        return ans ; 

    }
    private int helper(String a, String b) {

        int i = 0 , j = 0 ;
        while(j<b.length() && i<a.length()){
            char c = a.charAt(i) ;
            int x = b.indexOf(c , j) ;
            if(x == -1) return a.length() ;
            j = x+1 ;
            i++ ;
        }

        return i==a.length()?-1: a.length() ;
    }
}