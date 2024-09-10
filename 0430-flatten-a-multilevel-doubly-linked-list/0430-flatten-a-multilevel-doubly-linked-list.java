/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if( head == null) return head;
	// Pointer
        Node prev = head; 
        while( prev!= null) {
            /* CASE 1: if no child, proceed */
            if( prev.child == null ) {
                prev = prev.next;
                continue;
            }
            /* CASE 2: got child, find the tail of the child and link it to p.next */
            Node temp = prev.child;
            // Find the tail of the child
            while( temp.next != null ) 
                temp = temp.next;
            // Connect tail with p.next, if it is not null
            temp.next = prev.next;  
            if( prev.next != null )  prev.next.prev = temp;
            // Connect p with p.child, and remove p.child
            prev.next = prev.child; 
            prev.child.prev = prev;
            prev.child = null;
        }
        return head; 
    }
}