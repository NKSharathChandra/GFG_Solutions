class Solution
{
    Node compute(Node head)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        while(curr!= null) {
            list.add(curr.data);
            curr = curr.next;
        }
        
        Node Head = new Node(list.get(list.size()-1));
        for(int i = list.size()-2;i>=0;i--) {
            if(list.get(i)>=Head.data) {
                Node newNode = new Node(list.get(i));
                newNode.next = Head;
                Head = newNode;
            }
        }
        return Head;
    }
}
