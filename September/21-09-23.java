class Solution
{
    public int FindMaxSum(int arr[], int n)
    {
        if (n <= 0) return 0;
        
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=Math.max(0,arr[0]);
        
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i-1]);
        }
        
        return dp[n];
    }
}
