class Solution {
    public int findMinCost(String x, String y, int costX, int costY) {
        int common = longestCommonSubsequence(x,y,x.length(),y.length());
        if(common==0){
            return (x.length()*costX)+(y.length()*costY);
        }
        return ((x.length()-common)*costX)+((y.length()-common)*costY);
    }
    public static int longestCommonSubsequence(String str1, String str2,int n,int m){
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
