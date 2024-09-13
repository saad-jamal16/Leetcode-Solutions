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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        // to store values on left sides:
        ListNode leftTail = left;
        // to store values on right sides:
        ListNode rightTail = right;
        
        // it will add all values to leftmost sides:
        while(head != null){
            if(head.val < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            }
            //else it will add on the right sides:
            else{
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }
        // now both the left and right sides values will be added on single line
        leftTail.next = right.next;
        rightTail.next = null;
        return left.next;
        
    }
}