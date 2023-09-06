// Given a Directed Graph, find a Mother Vertex in the Graph (if present). 
// A Mother Vertex is a vertex through which we can reach all the other vertices of the Graph.

class Solution
{
    static void DFSUtil(ArrayList<ArrayList<Integer> > adj,int v, boolean[] visited)
    {
        visited[v] = true;
 
        for (int x : adj.get(v)) {
            if (!visited[x]) {
                DFSUtil(adj, x, visited);
            }
        }
    }
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        boolean[] visited = new boolean[V];
        int v = -1;
 
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSUtil(adj, i, visited);
                v = i;
            }
        }
        boolean[] check = new boolean[V];
        DFSUtil(adj, v, check);
        for (boolean val : check) {
            if (!val) {
                return -1;
            }
        }
        return v;
    }
}
