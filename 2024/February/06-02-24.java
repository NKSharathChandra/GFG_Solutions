class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k)
    {
        trav(root,1,k);
        return s.size();
    }
   
    HashMap<Integer,Node> h=new HashMap<>();
    HashSet<Node> s=new HashSet<>();
    public void trav(Node r,int k,int j){
        if(r==null){
            return ;
        }
        
       h.put(k,r);
        if(r.left==null&&r.right==null){
         if(h.containsKey(k-j)){
             
             s.add(h.get(k-j));
         }
        
        }
       h.put(k,r);
          trav(r.left,k+1,j);
          trav(r.right,k+1,j);

        
    }

}
