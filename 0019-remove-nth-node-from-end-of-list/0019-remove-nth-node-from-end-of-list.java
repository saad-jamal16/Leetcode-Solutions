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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;
        // move the second pointer ahead of first
        for(int i = 0; i < n; i++){
            secondPtr = secondPtr.next;
        }
        //move both until the second ptr is null
        while(secondPtr.next != null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        // we have to remove the node next to first node
        firstPtr.next = firstPtr.next.next;
        return dummy.next;
        
    }
}