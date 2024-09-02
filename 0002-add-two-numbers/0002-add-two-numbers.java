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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        
        int carry = 0; // set carry as zero
        while(l1 != null || l2 != null){
            int sum = 0 + carry; //inialized sum 0+ it will keep adding if carry
            
            if(l1 != null){   // it will operate first list at first.
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){    //use number from second list
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;   // get sum and carry both
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if(carry == 1) ptr.next = new ListNode(1);
       return result.next;
    }
}