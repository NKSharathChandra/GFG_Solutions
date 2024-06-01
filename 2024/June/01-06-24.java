class Solution {
    public static String oddEven(String s) {
        int[] freq = new int[27];
        for (int i = 0; i < s.length(); i++) {
            int position = s.charAt(i) - 'a' + 1;
            freq[position]++;
        }
        int sum = 0;
        for (int i = 1; i <= 26; i++) {
            if (freq[i] != 0) { 
                if (i % 2 == 0 && freq[i] % 2 == 0) {
                    sum++;
                } else if (i % 2 != 0 && freq[i] % 2 != 0) {
                    sum++;
                }
            }
        }
        return (sum % 2 == 0) ? "EVEN" : "ODD";
    }
}
