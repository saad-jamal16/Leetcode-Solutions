class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
         Stack<Integer> stack=new Stack<>();
        Deque<Integer> dq=new LinkedList<>();
        // -Pushing Sandwiches in Stack
        for (int i = sandwiches.length-1; i>=0; i--) {
           stack.push(sandwiches[i]);
        }
        // - Created Deque to add from both side
        for (int i = 0; i < students.length; i++) {
            dq.add(students[i]);
        }
        int eaten=0;
// To make sure that we dont get stuck in infinte Loop
        int count= 0;
        while (!stack.isEmpty()){
// If equal then Remove those elements from stack and queue
            if (Objects.equals(stack.peek(), dq.peek())){
                count=0;
                eaten++;
                stack.pop();
                dq.poll();
            }else {
// Else remove the first element and move it to last
                count++;
                int temp = dq.peekFirst();
                dq.pollFirst();
                dq.addLast(temp);
            }
// If this condition hits that means we have checked for all and no more comparisons are required
            if (count==dq.size()){
                break;
            }
        }
        return students.length-eaten;
    }
}