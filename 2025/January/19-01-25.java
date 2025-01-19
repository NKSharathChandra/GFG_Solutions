class Solution {
   public static Node rotataek(Node head, int k,int count){
        if(count==k){
            return head;
        }
        Node crr = head;
        while(crr.next!=null){
            crr=crr.next;
        }
        Node newHead = head.next;
        crr.next=head;
        head.next=null;
        
        return rotataek(newHead,k,count+1);
   }
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; 
        }
        
        Node current = head;
        int length = 1;
        
        while (current.next != null) {
            current = current.next;
            length++;
        }
        k = k % length;
         if (k == 0) {
            return head; 
        }
        return rotataek(head,k,0);
    }
}
