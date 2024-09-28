class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        // enter all the elements in queue
        for(int i = 1; i <= n; i++){
            q.offer(i);
        }
        // it size of queue should be more then  1
        while(q.size() > 1){
            for(int j = 1; j < k ; j++){
                
                q.offer(q.peek());
                q.poll();
            }
            q.poll();
        }
        return q.peek();
    }
}