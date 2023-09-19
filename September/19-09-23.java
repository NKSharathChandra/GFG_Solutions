class Solution
{
    public static int getFirstSetBit(int n){
        
        if( n == 0 ) return 0;
        int setBit = 1;
        while( n % 2 == 0 ){
            setBit++;
            n /= 2;
        }
        return setBit;    
    }
}
