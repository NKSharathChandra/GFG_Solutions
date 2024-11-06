class Solution {
    
    //static int res=0;
    public static int treePathsSum(Node root) {
        // add code here.
        int []res=new int[1];
        path(root,0,res);
        return res[0];
    }
    
    
    private static void path(Node root,int sum,int [] res){
        
        sum=sum*10+root.data;
        
        if(root.left==null && root.right==null){
            res[0]+=sum;
            //System.out.println(sum);
            return;
        }
        
        
        if(root.left!=null)     path(root.left,sum,res);
        if(root.right!=null)    path(root.right,sum,res);
        
    }
}
