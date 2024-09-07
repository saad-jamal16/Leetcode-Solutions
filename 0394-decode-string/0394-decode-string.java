class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> sStack = new Stack<>();
        int k = 0;
        for(int i = 0; i<s.length(); i++){
            String ch = "" +s.charAt(i);
            char ch1 = s.charAt(i);
            if(Character.isDigit(ch1)) k = (k * 10) + (ch1 - '0');
            else if(!ch.equals("]")){
                if(ch.equals("[")){
                    numStack.push(k);
                    k = 0;
                }
                sStack.push(ch);
            }
            else{
                String str  = "";
                while(!sStack.peek().equals("[")) str = sStack.pop() + str;
                sStack.pop();
                int num = numStack.pop();
                sStack.push(str.repeat(num));
            }
        }
        String s2 = "";
        while(!sStack.empty()){
            String s1 = sStack.pop();
            s2 = s1 + s2;
        }
        return s2;
        
    }
}