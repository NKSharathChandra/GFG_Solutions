class Solution {
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        if (x == y) return -1;
        List<Integer> list = new ArrayList<>();
        find(root,list,x,y);
        if (k > list.size()) return -1;
        return list.get(list.size() - k);
    }
    
    public static void find(Node node, List<Integer> list,int x, int y){
        if(node==null) return;
        
        list.add(node.data);
        if(x<node.data&&y<node.data)
        find(node.left,list,x,y);
        else if(x>node.data&&y>node.data)
        find(node.right,list,x,y);
        
    return ;
    }
}
