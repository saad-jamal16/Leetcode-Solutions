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
    public ListNode sortList(ListNode head) {
        // inialized count to store values and temp as start node
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        // inialized arrays to store all elements in arrays so that sorting becomes easy
        int []arr = new int[count];
        count = 0;
        temp = head;
        while(temp != null){
            arr[count++] = temp.val;
            temp = temp.next;
        }
        // direcly sorted the array
        Arrays.sort(arr);
        temp = head;
        count = 0;
        while(temp != null){
            temp.val = arr[count++];
            temp = temp.next;
        }
        return head;
    }
}