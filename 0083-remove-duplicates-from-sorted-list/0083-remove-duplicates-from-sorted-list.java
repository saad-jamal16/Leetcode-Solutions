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
    public ListNode deleteDuplicates(ListNode head) {
        // Check if the head is null or if the list has only one node
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode temp = prev.next;
        // two pointer has been declared one prev will see head and move one node at a time
        // while temp will try to match the node with the first node.
        
        while(temp != null){
            if(temp.val == prev.val){
                temp = temp.next;
                continue;
            }
            // if the temp and prev node will be matched it will skip the node
            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        // and then it will return the head as the new sorted linkedlist.
        prev.next = null;
        return head;
        
    }
}