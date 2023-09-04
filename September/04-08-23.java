// Given a matrix mat of size N x M where every element is either 'O' or 'X'. Replace all 'O' with 'X' that are surrounded by 'X'.
// A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.class Solution {
    static char[][] fill(int n, int m, char[][] a) {
        // Iterate over the first and last columns and mark 'O's and their neighbors as visited.
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 'O') {
                dfs(i, 0, a);
            }
            if (a[i][m - 1] == 'O') {
                dfs(i, m - 1, a);
            }
        }

        // Iterate over the first and last rows and mark 'O's and their neighbors as visited.
        for (int j = 0; j < m; j++) {
            if (a[0][j] == 'O') {
                dfs(0, j, a);
            }
            if (a[n - 1][j] == 'O') {
                dfs(n - 1, j, a);
            }
        }

        // Replace unvisited 'O's with 'X' and revert visited 'O's back to 'O'.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'O') {
                    a[i][j] = 'X';
                } else if (a[i][j] == '*') {
                    a[i][j] = 'O';
                }
            }
        }

        return a;
    }

    private static void dfs(int i, int j, char[][] a) {
        if (i < 0 || i >= a.length || j < 0 || j >= a[0].length || a[i][j] != 'O') {
            return;
        }

        // Mark 'O' as visited with '*'.
        a[i][j] = '*';

        // Recursively visit neighbors.
        dfs(i + 1, j, a);
        dfs(i - 1, j, a);
        dfs(i, j + 1, a);
        dfs(i, j - 1, a);
    }
}
