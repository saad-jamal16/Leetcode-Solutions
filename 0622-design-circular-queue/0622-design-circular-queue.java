class MyCircularQueue {
    Queue<Integer> que = new LinkedList<>();
    int s;

    public MyCircularQueue(int k) {
        s = k;
        
    }
    
    public boolean enQueue(int value) {
        if(que.size() == s)
            return false;
        que.offer(value);
            return true; 
    }
    
    public boolean deQueue() {
        if(que.size() == 0)
            return false;
        que.poll();
            return true;
        
    }
    // gets the front item from the que:
    public int Front() {
        return que.size() == 0? -1 : que.peek();
        
    }
    // gets the last item from the queue
    public int Rear() {
        if(que.size() == 0)
            return - 1;
        List<Integer> kk = (List)que;
        int  p = kk.get(kk.size() - 1);
        return p;
    }
    // checks whether empty circular queue is empty or not
    public boolean isEmpty() {
        return que.size() == 0;
        
    }
    // checks whether the circular queue is  full ot not
    public boolean isFull() {
        return que.size() == s;
        
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