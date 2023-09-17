class Solution
{
    public static long[] printFibb(int n) 
    {
        long[] Fib = new long[n];
        if(n == 0) return Fib;
        Fib[0] = 1;
        if(n == 1) return Fib;
        Fib[1] = 1;
        if(n == 2) return Fib;
        
        for( int i = 2 ; i < n ; i++)  Fib[i] = Fib[i-1] + Fib[i-2];
        return Fib;
    }
    
}
