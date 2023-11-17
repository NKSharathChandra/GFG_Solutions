class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
       
    Node bTreeToClist(Node root)
    {
        //your code here
        ArrayList<Integer> list = bt(root);
        
        Node head = null;
        Node tail = null;
        for(int a : list){
            Node x = new Node(a);
            if(head == null){
                head = x;
                tail = head;
            }
            else{
                tail.right = x;
                x.left = tail;
                tail = tail.right;
            }
        }
        tail.right = head;
        head.left = tail;
        return head;
        
    }
    static ArrayList<Integer> bt(Node node){
        ArrayList<Integer> list = new ArrayList();
        traversal(node,list);
        return list;
    }
    
    static void traversal(Node node,ArrayList<Integer> list){
        if(node == null)return;
      
      traversal(node.left,list);
        list.add(node.data);
        traversal(node.right,list);
        
    }
    
}
