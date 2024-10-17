class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        Node first=head;
        Node second=head.next;
        Node f=first;
        Node s=second;
        if(head.next==null)
        return new Node[]{f,s};
        if(head.next.next==null){
            f.next=null;
            return new Node[]{f,s};
        }
        int flag=1;
        while(head.next!=null){
            if(flag==1){
                if(first.next.next==null){
                first.next=null;
                return new Node[]{f,s};
                }
                else
                first.next=first.next.next;
                flag=0;
                if(first.next!=null)
                first=first.next;
                head=head.next;
            }
            else if(flag==0){
                if(second.next.next==null){
                second.next=null;
                return new Node[]{f,s};
                }
                else
                 second.next=second.next.next;
                flag=1;
                if(second.next!=null)
                second=second.next;
                head=head.next;
            }
        }
        first.next=null;
        second.next=null;
        return new Node[] {f,s};
    }
}
