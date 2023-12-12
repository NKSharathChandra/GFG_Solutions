class Solution{
static int maxGold(int n, int m, int M[][])
    {
        int anss=Integer.MIN_VALUE;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<n;i++){
            anss=Math.max(anss,ans(M,n,m,i,0,dp));
        }
        return anss;
    }
    public static int ans(int arr[][],int row,int col,int cr,int cc,int dp[][]){
        if(cr<0 || cc<0 || cr>=row || cc>=col){
            return 0;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        dp[cr][cc]=arr[cr][cc]+Math.max(ans(arr,row,col,cr,cc+1,dp),Math.max(ans(arr,row,col,cr-1,cc+1,dp),ans(arr,row,col,cr+1,cc+1,dp)));
        return dp[cr][cc];
    }
}  
  
