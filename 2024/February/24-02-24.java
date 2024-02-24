class Solution
{
    public int maxSum(int n) 
    { 
         return (n == 0) ? 0 : Math.max(maxSum(n / 2) + maxSum(n / 3) + maxSum(n / 4), n);
    } 
}
