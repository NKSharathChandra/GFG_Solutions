class Solution {

    // Return the sum of last k nodes
public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        
        int length=0;
        int sum=0;
        Node temp=head;
        while(temp != null){
            length++;
            sum+=temp.data;
            temp=temp.next;
        }
        
        int value=length-n;
        Node temp1=head;
        if(value == 0)
            return sum;
        while(temp1 != null ){
            sum-=temp1.data;
            temp1=temp1.next;
            value--;
            if(value == 0 )
                break;
        }
        
        return sum;
    }
}
