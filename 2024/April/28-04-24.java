class Solution {
    Node deleteMid(Node head) {
        if(head.next == null){
                    return null;
                }
                Node slow = head;
                Node fast = head;
                Node temp = null;
                
                while(fast!=null && fast.next!=null){
                    
                    temp = slow;
                    slow = slow.next;
                    fast = fast.next.next;
                }
                if(temp!=null)
                    temp.next = slow.next;
                
                return head;
    }
}
