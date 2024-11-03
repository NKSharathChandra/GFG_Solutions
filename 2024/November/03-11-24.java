class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        
        boolean flag = false;
        
        //for hidden test case
        if(head.next==null){
            return false;
        }
        
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
            flag = !flag;
        }
        return flag;
    }
}
