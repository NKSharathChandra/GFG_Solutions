class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
        if(head == null || head.next == null) return head;
        
        DLLNode newHead = null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        DLLNode ptr = newHead;
        DLLNode ptr2 = head;
        
        while(ptr2!=null){
            pq.add(ptr2.data);
            
            if(pq.size() > k){
                int top = pq.peek();
                DLLNode newNode = new DLLNode(top);
                pq.poll();
                if(newHead == null){
                    newHead = newNode;
                    ptr = newNode;
                }
                else{
                    ptr.next = newNode;
                    newNode.prev = ptr;
                    ptr = ptr.next;
                }
            }
            
            ptr2 = ptr2.next;
        }
        
        while(!pq.isEmpty()){
            int top = pq.peek();
            DLLNode newNode = new DLLNode(top);
            ptr.next = newNode;
            newNode.prev = ptr;
            ptr=ptr.next;
            pq.poll();
        }
        
        return newHead;
    }
}
