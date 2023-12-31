class Solution{
    static String findLargest(int N, int S){
        if (9*N<S || (S == 0 && N != 1))  return "-1";
        String ans = "";
        int i = 9;
        
        while(N>0){
            if(S>=i){
                ans = ans + Integer.toString(i);
                S -= i;
                N--;
            }
            else if(S<i) i--;
        }
        
        return ans;
    }
}
