class GfG
{
 Node mergeResult(Node node1, Node node2){
    Node ptr=null,temp=null;
    while(node1 != null && node2 != null){
        if(node1.data < node2.data){
            temp = node1;
            node1 = node1.next;
        }
        else{
            temp = node2;
            node2 = node2.next;
        }
        temp.next = ptr;
            ptr = temp;
    }
    while(node1 != null){
        temp = node1;
        node1 = node1.next;
        temp.next = ptr;
        ptr = temp;
    }
    while(node2 != null){
        temp = node2;
        node2 = node2.next;
        temp.next = ptr;
        ptr = temp;
    }
    return ptr;
    }
}
