class Solution{
    static long sumOfDivisors(int N){
        long sum =0;
        for(int i=1;i<=N;i++){
            sum = sum + i*(N/i);
        }
        return sum;
    }
}
