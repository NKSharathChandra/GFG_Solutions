class Solution {
public Node removeAllDuplicates(Node head) {
        // code here
        HashMap<Integer,Integer>m = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            m.put(temp.data,m.getOrDefault(temp.data,0)+1);
            temp = temp.next;
        }
        temp = head;
        Node prev = null;
        while(temp!=null){
            if(m.get(temp.data)>1){
                if(temp==head){
                    head = head.next;
                    // temp = temp.next;
                }
                else{
                    prev.next = temp.next;
                }
            }
            else{
                prev = temp;
            }
            
            temp = temp.next;
        }
        return head;
    }
}
