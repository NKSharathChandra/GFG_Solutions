class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int find_len(int x, int y,int [][] dp, String s1, String s2){
        
        for( int i = 0 ; i <x ; i++){
            for( int j = 0 ; j < y ; j++){
                
                if( s1.charAt(i) == s2.charAt(j)) dp[i + 1][j + 1] = 1 + dp[i][j];
                
                else dp[i + 1][j + 1] = Math.max( dp[i + 1][j], dp[i][j + 1]);
           }
        }
       
        return dp[x][y];   
    }
    
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int [][] dp = new int [x+1][y+1];
        
        for( int i = 0 ; i <= x ; i++){
            for( int j = 0 ; j <= y ; j++){
                dp[i][j] = 0;
            }
        
        }
    return find_len(x,y,dp,s1,s2);    
    
    }

}
