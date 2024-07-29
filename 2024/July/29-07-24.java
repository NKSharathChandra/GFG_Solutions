class Solution {
    public int rowWithMax1s(int arr[][]) {
        int index=-1;
        int max=0;
        
        int n=arr.length,m=arr[0].length;
        
        for(int i=0;i<n;i++){
        int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1)count++;
            }
            if(max<count){
                max=count;
                index=i;
            }
        }
        return index;
    }
}
