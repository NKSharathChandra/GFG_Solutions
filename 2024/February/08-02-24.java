class Solution

{
    boolean check(Node root) {
        // Set to store levels of leaf nodes
        Set<Integer> leafLevels = new HashSet<>();
       
        // Helper function to traverse tree and record leaf levels
        traverse(root, 0, leafLevels);
       
        // If all leaf nodes are at the same level, return true, else false
        return leafLevels.size() == 1;
    }
   
    private void traverse(Node node, int level, Set<Integer> leafLevels) {
        if (node == null)
            return;
        if (node.left == null && node.right == null)
            leafLevels.add(level);
        traverse(node.left, level + 1, leafLevels);
        traverse(node.right, level + 1, leafLevels);
    }
}
