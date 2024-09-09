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
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        // iterate both different speed until they meet once
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
           //as soon as they meet start from the head again
            // move at same speed
        if(slow == fast){
            while(head != slow){
                head = head.next;
                slow = slow.next;
            }
             return slow;
        }
        }
         return null;
    
}
}
