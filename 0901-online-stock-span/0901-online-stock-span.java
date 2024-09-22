class StockSpanner {
    Stack<int[]>stack;
    // here price and answer has been kept

    public StockSpanner() {
        stack = new Stack();
        
    }
    
    public int next(int price) {
        // answer 1 will always be there: 
        int ans = 1;
        //monotoniaclly decreasing stack:
        while(!stack.isEmpty() && stack.peek()[0]<= price){
            // monotonically decreasing stack will be made here
            ans+= stack.pop()[1];
        }
        // put the current answre in the stack
        stack.push(new int[]{price,ans});
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */