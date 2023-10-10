class Solution {
    int height(Node node) 
    {
         if (node == null) return 0;
        
        int lh = height(node.left);
        int rh = height(node.right);
        
        return Math.max(lh, rh) + 1;
    }
}
