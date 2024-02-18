class Solution{
public static int sumOfLeafNodes(Node root){
        if(root==null)
            return 0;
        
        if(root.left==null && root.right==null)
            return root.data;
        
        int lSum = sumOfLeafNodes(root.left);
        int rSum = sumOfLeafNodes(root.right);
        return lSum+rSum;
    }
}
