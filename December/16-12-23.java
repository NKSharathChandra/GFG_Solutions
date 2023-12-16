class Solution {
    static long countStr(long n) {
        // Initialize variables to count different combinations
        long countA = 1, countB = n, countC = n;
        long countAB = n * (n - 1); // Strings with 'a' and 'b'
        long countAC = countAB / 2; // Strings with 'a' and 'c'
        long countBC = countAC * (n - 2); // Strings with 'b' and 'c'

        // Sum up all the counts
        long total = countA + countB + countC + countAB + countAC + countBC;
        
        return total;
    }
}
