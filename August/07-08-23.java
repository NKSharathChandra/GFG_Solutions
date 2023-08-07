class Solution 
{   
    private static final int N = 9;
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int[][] grid) { 
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(grid[i][j] == 0) {
                    for(char c=1; c<=9; c++) {
                        if(isValid(grid, i, j, c)) {
                            grid[i][j] = c;
                            if(SolveSudoku(grid)) return true;
                            else grid[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(int[][] grid, int row, int col, char c) {
        for(int i=0; i<9; i++) {
            if(grid[i][col] == c) return false;
            if(grid[row][i] == c) return false;
            if(grid[3*(row/3)+(i/3)][3*(col/3)+(i%3)] == c) return false;
        }
        return true;
    }

    //Function to print grids of the Sudoku.
    void printGrid (int[][] grid) {
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }
    
    }

}
