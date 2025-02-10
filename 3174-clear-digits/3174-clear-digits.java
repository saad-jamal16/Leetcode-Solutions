class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9')
            {
                stack.deleteCharAt(stack.length()-1);
            }
            else
            {
                stack.append(s.charAt(i));
            }
        }
        return stack.toString();
    }
}