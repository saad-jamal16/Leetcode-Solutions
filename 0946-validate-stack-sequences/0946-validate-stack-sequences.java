class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0; // it will keep track of pushed element
        for (int num : pushed){
            stack.push(num); //current element into stack
            while(!stack.isEmpty() && stack.peek() == popped[i]){
                // if the top element of the stack is the same as the next element in popped
                //pop the top element from the stack and increment i to move  to the next elem
                stack.pop();
                i++;
            }
        }
        // if the stack is empty all the elements have been popped int the correct order
        // return true, otherwise return false
        return stack.isEmpty();
        
    }
}