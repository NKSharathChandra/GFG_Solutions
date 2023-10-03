class Solution
{
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int row = 0, col = 0;
        
        for(int j = 0; j < m; j++) ans.add(matrix[0][j]);
        
        for(int i = 1; i < n; i++) ans.add(matrix[i][m - 1]);
        
        for(int j = m - 2; j >= 0 && n > 1; j--) ans.add(matrix[n - 1][j]);
        
        for(int i = n - 2; i > 0 && m > 1; i--) ans.add(matrix[i][0]);
        
        return ans;
    }
}
