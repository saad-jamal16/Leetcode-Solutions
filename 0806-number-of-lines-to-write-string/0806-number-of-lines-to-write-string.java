class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0,row=1;
       for(char c : s.toCharArray()){
         int curr=widths[c -'a'];
        if(curr + sum >100){
            sum=curr;
            row++;
        }else{
            sum+=curr;
        }
       } 
       return new int[]{row, sum};
    }
}