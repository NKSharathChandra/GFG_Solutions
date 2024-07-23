class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        List<Integer> result=new ArrayList<>();
        traversal(root1, result);
        traversal(root2, result);
        
        Collections.sort(result);
        return result;
    }
    
    public void traversal(Node node, List<Integer> list)
    {
        if(node!=null) 
        {
            list.add(node.data);
            traversal(node.left, list);
            traversal(node.right, list);
        }
    }
}
