class Solution {
    public Node addOne(Node head) {
        // code here.
        Node head1=reverse(head);
        Node newHead=head1;
        int carry=0;
        while(head1!=null){
            int val=head1.data+1;
            if(val<=9){
                head1.data=val;
                carry=0;
                break;
            }else{
                head1.data=0;
                carry=1;
            }
            head1=head1.next;
        }
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=newHead;
            return newNode;
        }
        else{
            Node head2=reverse(newHead);
            return head2;
        }
    }
    public Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
