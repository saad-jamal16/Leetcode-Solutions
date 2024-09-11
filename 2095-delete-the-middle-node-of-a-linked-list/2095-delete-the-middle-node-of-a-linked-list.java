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
    public ListNode deleteMiddle(ListNode head) {
        
        // its a base condition
        if(head == null || head.next == null) return null;
        
        // Three pointer has been inialized
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        //iterarted till null
        
        while(fast != null && fast.next != null){
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
        }
        // prev will be  just at back from the middle node
        // prev will direct point to next node which is after middle
        prev.next = slow.next;
        return head;
        
    }
}