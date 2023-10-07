class Solution {
    public Node pairwiseSwap(Node head)
    {
        if(head == null || head.next == null) return head;
         Node nextNode=head.next;
         head.next=pairwiseSwap(nextNode.next);
         nextNode.next=head;
         return nextNode;
    }
}
