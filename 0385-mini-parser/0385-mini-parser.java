/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public NestedInteger deserialize(String s) {
         Deque<NestedInteger> stack = new ArrayDeque<>();
        NestedInteger cur = new NestedInteger();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '['){
                stack.push(cur);
                cur = new NestedInteger();
            }else if (ch == '-' || Character.isDigit(ch)){
                int j = i + 1;
                while(j < s.length() && Character.isDigit(s.charAt(j))){
                    ++j;
                }
                cur.add(parse(i, j, s));
                i = j - 1;
            }else if (ch == ']'){
                stack.peek().add(cur);
                cur = stack.pop();
            }
        }
        return cur.getList().get(0);
    }

    private NestedInteger parse(int lo, int hi, String s){
        return new NestedInteger(Integer.parseInt(s.substring(lo, hi)));
    }
}