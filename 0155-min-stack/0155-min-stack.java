class MinStack {
    // creating two stack
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();

    public MinStack() {
        
    }
    
    public void push(int val) {
        //first time insert but if new min found add to minStack
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }
    // to remove element on the top of stack:
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
        
    }
    //gets the top element of stack:
    
    public int top() {
        return stack.peek();
        
    }
    //get the minimum elements in the stack
    
    public int getMin() {
        return minStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */