class Solution
{
    public static int isSumProperty(Node root)
    {
        if(root == null)return 1;
        if(root.left == null && root.right == null)return 1;
        int left = (root.left!=null)?root.left.data:0,right = (root.right!=null)?root.right.data:0;
        if(left+right!=root.data)return 0;
        return (isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1)?1:0;
        
    }
}
