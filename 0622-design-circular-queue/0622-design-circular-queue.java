class MyCircularQueue {
    Queue<Integer> nm = new LinkedList<>();
    int s;

    public MyCircularQueue(int k) {
        s = k;
        
    }
    
    public boolean enQueue(int value) {
        if(nm.size() == s)
            return false;
        nm.offer(value);
            return true; 
    }
    
    public boolean deQueue() {
        if(nm.size() == 0)
            return false;
        nm.poll();
            return true;
        
    }
    
    public int Front() {
        return nm.size() == 0? -1 : nm.peek();
        
    }
    
    public int Rear() {
        if(nm.size() == 0)
            return - 1;
        List<Integer> kk = (List)nm;
        int  p = kk.get(kk.size() - 1);
        return p;
    }
    
    public boolean isEmpty() {
        return nm.size() == 0;
        
    }
    
    public boolean isFull() {
        return nm.size() == s;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */