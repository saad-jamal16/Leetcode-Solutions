class FrontMiddleBackQueue {
    LinkedList<Integer> que;

    public FrontMiddleBackQueue() {
        // iniailzed LinkedList
        this.que = new LinkedList<>();
        
    }
    
    public void pushFront(int val) {
        //because value is to be passed on front so at 0 node it have inialised
        que.add(0, val);
        
    }
    
    public void pushMiddle(int val) {
        // it will divide the complete node and add in the middle
        que.add(que.size()/2,val);
        
    }
    
    public void pushBack(int val) {
        //because no logic is given so it will add the value at the back.
        // no any node is given
        que.add(val);
        
    }
    
    public int popFront() {
        // if queue is empty it will return -1 otherwise it will remove the element
        // which is in the 0th node
        return que.isEmpty()? -1 : que.remove(0);
        
    }
    
    public int popMiddle() {
        //if empty then it will return -1 otherwise queue sie will be divided by
        // 2 and then it will remove the middle node
        return que.isEmpty()? -1 : que.remove((que.size() - 1) / 2);
        
    }
    
    public int popBack() {
        //if empty then -1 otherwise it will remove node from the back of 
        // LinkedList
        return que.isEmpty()? -1 : que.remove(que.size()-1);
        
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */