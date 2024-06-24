class Solution {
    static long sumMatrix(long n, long q) {
        if(q < 2 || n+n < q)               // Element not present in matrix
            return 0;
        if(q > n)                              // Element not from first row expect diagonal element that is q > n
            return 2 * n - q + 1;
        return q - 1;                        // 2 <= q <= n 
    }
}
