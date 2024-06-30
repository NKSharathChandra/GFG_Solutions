class Solution {
    public Node deleteNode(Node head, int x) {
        Node temp = head;
        if(x == 1) { // if it is the first node in the linked list
            return head.next;
        }
        for(int i=1;i<x;i++) {
            temp = temp.next;
        }
        if(temp.next != null) { // if it is not the last node in the linked list
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
        }
        if(temp.next == null) // if the given node is the last node in the linked list
            temp.prev.next = null;
            
        return head;
    }
}
