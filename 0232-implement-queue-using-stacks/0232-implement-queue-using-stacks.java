class MyQueue {
    private Stack<Integer>stack1 = new Stack<Integer>();
    private Stack<Integer>stack2 = new Stack<Integer>();

    public MyQueue() {
        
    }
    //push
    
    public void push(int x) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        
    }
    // to remove from the front
    public int pop() {
        return stack1.pop();
    }
    //return from the front
    public int peek() {
        return stack1.peek();
        
    }
    // return true if empty else return false
    public boolean empty() {
        return stack1.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */