class GfG
{
    Node deleteNode(Node head, int x)
    {
        Node temp = head;
        
        if( x == 1 ) return temp = temp.next;
        
        for(int i = 1 ; i <= x - 2 ; i++ ) temp = temp.next;
        
        temp.next = temp.next.next;
        
        return head;
    }
}
