class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0){
            return 0;
        }
        String s = String.valueOf(n);
        StringBuilder xbuilder = new StringBuilder();
        long sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int digit = c -'0';

            if(digit != 0){
                xbuilder.append(c);
                sum+= digit;
            }
        }
        long x = Long.parseLong(xbuilder.toString());
        return x * sum;
    }
}