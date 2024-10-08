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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode originalHead = head;
        ListNode cur = head.next;
        int sum = 0;
        
        while(cur != null){
            if(cur.val == 0){
                head.val = sum;
                sum = 0;
            
            if(cur.next != null){
                head = head.next;
            }
        }
            sum += cur.val;
            cur = cur.next;
        }
        head.next = null;
        return originalHead;
}
}  
