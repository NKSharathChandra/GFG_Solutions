class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> ans = new ArrayList<> ();
        boolean[] vis = new boolean[V];
        
        return dfs(ans,adj,vis,0);
    }
    
    public ArrayList<Integer> dfs( ArrayList<Integer> ans , ArrayList<ArrayList<Integer>> adj , boolean vis[] , int node) {
        
        vis[node]=true;
        
        ans.add(node);
        
        for(int it:adj.get(node)){
            if(!vis[it]){
               dfs(ans,adj,vis,it); 
            }
        }
        
        return ans;
        }
    
}
