class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (((arr[j] >> i) & 1) == 1) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
};
