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
    public int[] nextLargerNodes(ListNode head) {
         int arr[] = new int[size(head)];
        Stack<ListNode> st = new Stack<>();
        ListNode l = head;
        while(head!=null){
            while(!st.isEmpty()&&st.peek().val<head.val){ 
               st.pop().val = head.val;
            }
            st.push(head);
            head = head.next;
        }
        while(!st.isEmpty()){
            st.pop().val = 0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = l.val;
            l = l.next;
        }
        return arr;
    }
    private int size(ListNode head){
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }
}