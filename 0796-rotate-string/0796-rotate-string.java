class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
        /* very simply just checking if the length of string s is equal to length
         of string goal and if yes the one more condition to check we have and 
        that is the sum of string s and goal(s+s) is goal or not i.e it will check
         if its goal direclty print it.*/
        
    }
}