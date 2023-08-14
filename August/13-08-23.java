class Solution {
    static int nthFibonacci(int n){
        if (n <= 1) return n;
        
        int MOD = 1000000007;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % MOD;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
