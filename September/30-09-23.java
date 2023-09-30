class Solution
{
    void booleanMatrix(int matrix[][])
    {
        int r = matrix.length;
        int c = matrix[0].length;
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }        
            }
        }
        
        for(int i=0;i<r;i++){
            if(row[i] == 1){
                for(int j=0;j<c;j++){
                    matrix[i][j] = 1;
                }
            }
        }

        for(int j=0;j<c;j++){
            if(col[j] == 1){
                for(int i=0;i<r;i++){
                    matrix[i][j] = 1;
                }
            }
        }
        
    }
}
