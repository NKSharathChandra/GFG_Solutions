class Solution {
    public static int count(Node head, int key) {
        // code here
        if(head == null) return 0;
        int fcount = 0;
        while(head.next!=null){
            if(key == head.data) fcount++;
            head = head.next;
        }
        if(key == head.data) fcount++;
        return fcount;
    }
}
