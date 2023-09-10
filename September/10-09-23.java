// Given a BST and a key K. If K is not present in the BST, Insert a new Node with a value equal to K into the BST. If K is already present in the BST, don't modify the BST.
class Solution {
    Node insert(Node root, int Key) {
        if(root==null) root= new Node(Key);
        if(root.data>Key) root.left= insert(root.left, Key);
        if(root.data<Key) root.right= insert(root.right, Key);
        return root;
    }
}
