class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        for(int i = 2 ; i * i <= N ; i++ ){
            
            if(N%i == 0){
                
                 while( N>i && N%i == 0 ) N /= i;
            }
        }
    return N;
    }
}
