class Solution {
    // Function to rotate a linked list.
 public Node rotate(Node head, int k) {
        // add code here       

        if(head==null)return null;       

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        while(k!=0){
            temp.next=head;
            temp=head;
            head=head.next;
            k--;
        }
        
        temp.next=null;
        return head;
    }

}
