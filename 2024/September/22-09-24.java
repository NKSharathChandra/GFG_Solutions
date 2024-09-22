class Solution {
    public int lps(String str) {
        int n = str.length();
        int[] kmp = new int[n + 1];
        int i = 0, j = -1;
        kmp[0] = -1;
        while (i < n) {
            while (j != -1 && str.charAt(j) != str.charAt(i)) {
                j = kmp[j];
            }
            j++; i++;
            kmp[i] = j;
        }
        return kmp[n];
    }
}
