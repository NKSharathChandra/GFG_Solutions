class Solution{
static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        List<Integer> ans = new ArrayList<>(queries.length);
        
        for(int i = 0; i<queries.length; i++){
            ans.add(getHopSum(mat, n, m, queries[i][1], queries[i][2], queries[i][0]));
        }
        
        return ans;
    }
    
    private static int getHopSum(int[][] mat, int n, int m, int i, int j, int dia){
        int startX = i-dia;
        int startY = j-dia;
        int stopX = i+dia;
        int stopY = j+dia;
        
        int sum = 0;
        
        // top boundary
        for(int x = startX, y = startY; x < stopX; x++){
            if(x >=0 && x<n && y>=0 && y<m)
                sum += mat[x][y];
        }
        
        // right boundary
        for(int x = stopX, y = startY; y < stopY; y++){
            if(x >=0 && x<n && y>=0 && y<m)
                sum += mat[x][y];
        }
        
        // bottom boundary
        for(int x = stopX, y = stopY; x > startX; x--){
            if(x >=0 && x<n && y>=0 && y<m)
                sum += mat[x][y];
        }
        
        // left boundary
        for(int x = startX, y = stopY; y > startY; y--){
            if(x >=0 && x<n && y>=0 && y<m)
                sum += mat[x][y];
        }
        
        return sum;
    }
}
