// Given a Binary Search Tree. Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.
class Solution
{   int count=0, ans=0;
    public int kthLargest(Node root,int K)
    {   reverseinorder(root,K);
        return ans;
    }
    public void reverseinorder(Node root,int K){
        if(root==null)return;
        reverseinorder(root.right,K);
        count++;
        if(count==K){
            ans=root.data;
            return ;
        }
        reverseinorder(root.left,K);
    }
}
