/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // same two pointers algorithm was used here 
        // declared two listNode both from head one will move 
        //one node while other will move two nodes at a time
        ListNode slow = head;
        ListNode fast = head;
        //both pointer will move from head to tail
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // if both the pointer will meet at same node that means it has cycle
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}