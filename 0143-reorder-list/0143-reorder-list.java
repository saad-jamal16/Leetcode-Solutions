/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        //find the middle of list:
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse the second half:
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        //merge the two halves of the list:
        ListNode P1 = head;
        ListNode P2 = prev;
        while(P2 != null){
            ListNode next1 =  P1.next;
            ListNode next2 =  P2.next;
            P1.next = P2;
            P2.next = next1;
            P1 = next1;
            P2 = next2;
            
         }
        
        
    }
}