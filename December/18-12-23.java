class Solution {
static int gameOfXor(int N , int[] A) {
        
        //if n is even then all the number appear in subarray
        //will be even and the xor of all will be zero
        //else if its odd 
        //then the number appear at position (1,3,5,7...) are even they 
        //will cancel out each other
        //and the number appear at position (0,2,4,6...) are odd then we need to
        //take xor of those positions only
        
        //number subarray of ith index inculding it
        // a b c(i) d e  
        // (a ab abc) (d de) -> (a ab abc) + (ad ade abd abde abcd abcde)
        //                        (i+1)    + (i+1)(n-(i+1))
        //number of subarray of element i = (i+1)(n-i)
        //for n = even this value will be even for every index
        //for n = odd this value will be odd for even index and even for odd index
        if((N&1)==0){
            return 0;
        }
        int ans = 0;
        for(int i=0;i<N;i=i+2){
            ans ^= A[i];
        }
        return ans;
    }
};
