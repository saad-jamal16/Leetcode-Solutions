class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        //add current ping to queue
        q.add(t);
        // keep removing from queue while more then 3000 ms
        while(q.peek() < t - 3000){
            q.poll();
        }
        // return the size of queue
        return q.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */