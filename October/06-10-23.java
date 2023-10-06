class Solution
{
 public static void rearrange(Node odd)
    {
        if(odd.next == null) return;
        Node alt = null;
        Node current = odd;
        Node prev = null;
        while(current!= null&& current.next!=null){
            prev=current;
            Node future = current.next;
            current.next = future.next;
            future.next = alt;
            alt=future;
            current =current.next;
        }
        if(prev != null && prev.next != null)  prev.next.next=alt;
        else    prev.next= alt;
    }
}
