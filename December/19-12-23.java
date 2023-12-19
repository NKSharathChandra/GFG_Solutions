class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here   
        if (m == n) return -1;
        int count = 1;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            if ((m & mask) == (n & mask)) count++;
            else break;
        }
        return count;  
    }
}
