class Solution{
    static int solve(int sum,int []arr,int i,int [][]dp){
        if(sum==0)return 1;
        if(i>=arr.length||sum<0)return 0;
        if(dp[i][sum]!=-1)return dp[i][sum];
        if(solve(sum-arr[i],arr,i+1,dp)==1||solve(sum,arr,i+1,dp)==1)return dp[i][sum]=1;
        return dp[i][sum]= 0;
    }
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        
        for(int i=0;i<N;i++)
        sum+=arr[i];
        if(sum%2!=0)return 0;
        sum/=2;
        int [][]dp= new int [N+1][sum+1];
        for(int i=0;i<=N;i++)
        Arrays.fill(dp[i],-1);
        return solve(sum,arr,0,dp);
    }
}
