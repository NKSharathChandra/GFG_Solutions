class Solution {
    Node prev;
    public Node flattenBST(Node root) {
        Node dummy=new Node(-2);//MADE DUMMY NODE
        prev=dummy;
        inorder(root);
        prev.left=null;prev.right=null;
        return dummy.right;
        // Code here
    }
    void inorder(Node root){//USE THE DUMMY NODE
        if(root!=null){
            inorder(root.left);
            prev.left=null;prev.right=root;
            prev=root;
            inorder(root.right);
        }        
    }
}
