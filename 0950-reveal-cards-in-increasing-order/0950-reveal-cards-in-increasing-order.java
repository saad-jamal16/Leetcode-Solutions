class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        
        Queue<Integer> q =  new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(i);
        }
        int [] res = new int[n];
        for(int i = 0; i < n; i++){
        //q.poll() removes and returns the element at the front of the queue q.
        //The value at index i of deck is placed into the res array at the index returned by q.poll().
            res[q.poll()] = deck[i];
            //q.poll() again removes and returns the front element of the queue.
            q.add(q.poll());
        }
        
        return res;
    }
}