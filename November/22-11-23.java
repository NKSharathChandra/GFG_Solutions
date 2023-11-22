class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        if (root == null) {
            return true;
        }
        return check(root.left,root.right);
        
    }
    public static boolean check(Node head1,Node head2){
        if(head1==null && head2==null)return true;
        if(head1==null || head2==null || head1.data!=head2.data)return false;
        
     boolean left=check(head1.left,head2.right);
     boolean  right=check(head1.right,head2.left);
     return left&&right;
    }
}
