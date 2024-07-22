class Solution{
    
    static class SubTreeInfo {
        boolean isBST;
        int size;
        int min;
        int max;
        
        SubTreeInfo(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    
    static int largestBst(Node root) {
        return largestBstHelper(root).size;
    }
        static SubTreeInfo largestBstHelper(Node node) {
        if (node == null) {
            return new SubTreeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        
        SubTreeInfo leftInfo = largestBstHelper(node.left);
        SubTreeInfo rightInfo = largestBstHelper(node.right);
        
        if (leftInfo.isBST && rightInfo.isBST && node.data > leftInfo.max && node.data < rightInfo.min) {
            int size = leftInfo.size + rightInfo.size + 1;
            int min = Math.min(node.data, leftInfo.min);
            int max = Math.max(node.data, rightInfo.max);
            return new SubTreeInfo(true, size, min, max);
        } else {
            int size = Math.max(leftInfo.size, rightInfo.size);
            return new SubTreeInfo(false, size, 0, 0);
        }
    }
}
