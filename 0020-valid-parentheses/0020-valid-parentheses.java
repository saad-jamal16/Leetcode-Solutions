class Solution {
    public boolean isValid(String s) {
        // create a  empty stack
        Stack<Character> stack = new Stack<>();
        // push all the alternativies of brackets into the stack
        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            // and if the parenthesis stack does not matches the given character stack
            // then it will return false
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
        
    }
}