class Solution{
public int getCount(Node node, int bud)
    {
        Queue<Node> st=new LinkedList<>();
        Queue<Integer> levels=new LinkedList<>();
        st.add(node);
        levels.add(1);
        int count=0;
        while(!levels.isEmpty()){
            Node temp=st.remove();
            int level=levels.remove();
            if(temp.left==null && temp.right==null){
                if(bud-level>=0){
                    bud=bud-level;
                    count++;
                    
                }
                else break;
            }
            else{
                if(temp.left!=null){
                    st.add(temp.left);
                    levels.add(level+1);
                }
                if(temp.right!=null){
                    st.add(temp.right);
                    levels.add(level+1);
                }
                
            }
        }
        return count;
    }
}
