class Solution{
    int minRow(int n, int m, int a[][]) {
        // code here
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int resultIndex = 1;
        int index = 1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum += a[i][j];
            }
            
            if (sum < min){
                min = sum;
                resultIndex = index;
            }
            
            index++;
            sum = 0;
            
        }
        
        return resultIndex;
    }
}
