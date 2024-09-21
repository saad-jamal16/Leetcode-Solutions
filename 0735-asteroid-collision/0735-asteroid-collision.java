class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> stack = new Stack<>();
        for(int ast : asteroids){
            if(ast > 0){
                //put all the positive numbers  in stack
                stack.push(ast);
            }
            else{
                // see the condition if the first element
                //of stack is less then maths absolute value
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(ast)){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() <0){
                    stack.push(ast);
                }
                if(stack.peek() == Math.abs(ast)){
                    stack.pop();
                }
            }
        }
        //The line converts a Stack<Integer> into an int[] array 
        //by streaming the stack's elements
        return stack.stream().mapToInt(i -> i).toArray();
        
    }
}