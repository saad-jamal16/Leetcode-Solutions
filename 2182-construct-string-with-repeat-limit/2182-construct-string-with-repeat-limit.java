class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<Character> q = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Character> extra = new PriorityQueue<>(Comparator.reverseOrder());
        for(char c : s.toCharArray()){
            q.add(c);
        }
        StringBuilder sb = new StringBuilder();

        char prev = q.poll();
        sb.append(prev);
        int count = 1;

        while(!q.isEmpty()){
            char c =  q.poll();
            if(prev == c && count < repeatLimit) {
                sb.append(c);
                count++;
            } else if (prev == c ) {
                extra.add(c);
            } else {
                if (!extra.isEmpty() && extra.peek() > c){
                    sb.append(c);
                    int popCount =0;
                    while (!extra.isEmpty() && extra.peek() > c && popCount < repeatLimit) {
                        q.add(extra.poll());
                        popCount++;
                    }
                } else {
                    sb.append(c);
                }
                prev = c;
                count=1;
            }
        }
        return sb.toString();
    }
}