class Solution
{
    public int  Count(int[][] matrix)
    {   int count=0;
        int[] dx = {-1,-1,0,1,1,1,0,-1};
        int[] dy = {0,-1,-1,-1,0,1,1,1};
        int x = matrix.length;
        int y = matrix[0].length;
        for(int row=0; row<matrix.length; row++) {
            for(int col=0; col<matrix[row].length; col++){
                if(matrix[row][col] == 1){
                    int zerosCount = 0;
                    for(int idx=0; idx<8; idx++){
                        int newRow = row+dx[idx];
                        int newCol = col+dy[idx];
                        if(isValid(x, y , newRow, newCol) && matrix[newRow][newCol] == 0){
                            zerosCount++;
                        }
                    }
                    if(zerosCount != 0 && zerosCount%2 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    public boolean isValid(int row, int col,int x,int y){
        return x >= 0 && x < row && y>=0 && y < col;
    }
}
