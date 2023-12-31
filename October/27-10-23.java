class Solution{
    static int recur(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        
    int [][] dp = new int[n+1][m+1];
    
    for(int[] rows : dp){
        Arrays.fill(rows,-1);
    }
    
    
    for(int i = 0; i<=n;i++){
        dp[i][0] = 0;
    }
    
    for(int i=0;i<=m;i++){
        dp[0][i] = 0;
    }
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j] = 1 + dp[i-1][j-1];
            }
            else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
    }
    
    return dp[n][m];
    }
    static int minimumNumberOfDeletions(String S) {
        StringBuilder rev = new StringBuilder(S).reverse();
        int lcs = recur(S,rev.toString());
        return S.length()-lcs;
    }
}
