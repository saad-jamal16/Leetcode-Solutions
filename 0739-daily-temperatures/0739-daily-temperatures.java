class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            // comparing from top of stack element and temperature
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                // and then current index - popped index
                int pop = stack.pop();
                res[pop] = i-pop;
            }
            stack.push(i);
        }
        return res;
        
        
    }
}