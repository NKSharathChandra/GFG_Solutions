// Given a Binary Tree of size N, Print the corner nodes ie- the node at the leftmost and rightmost of each level
class Tree
{
    public static void printCorner(Node node)
    {   
        if( node == null ) return;
        Node temp = node;
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        
        while( ! q.isEmpty()){
            int size = q.size();
            
            for( int i = 0; i < size ; i++){
                Node curr = q.poll();
                if( i == 0 || i == size-1 ) System.out.print(curr.data + " ");
                
                if ( curr.left != null) q.add(curr.left);
                if ( curr.right != null) q.add(curr.right);
                
            }
        }
        
    }
    
}
