class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int cur = 0;
        for(char i : s.toCharArray()){
            if(i == '(' ){
                cur += 1;
            }else if(i == ')'){
                cur -= 1;
            }
            res = Math.max(res,cur);
        }
        return res;
    }
}