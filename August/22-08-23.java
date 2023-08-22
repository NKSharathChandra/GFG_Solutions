class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        
        // Initialize the sumRow[] and sumCol[] array to 0
        int[] sumRow = new int[N];
        int[] sumCol = new int[N];
        // Calculate sumRow[] and sumCol[] array
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j) {
                sumRow[i] += matrix[i][j];
                sumCol[j] += matrix[i][j];
            }
        // Find maximum sum value in either row or in column
        int maxSum = 0;
        for (int i = 0; i < N; ++i) {
            maxSum = Math.max(maxSum, sumRow[i]);
            maxSum = Math.max(maxSum, sumCol[i]);
        }
        int count = 0;
        for (int i = 0, j = 0; i < N && j < N;) {
            // Find minimum increment required in either row
            // or column
            int diff = Math.min(maxSum - sumRow[i],
                                maxSum - sumCol[j]);
            // Add difference in corresponding cell,
            // sumRow[] and sumCol[] array
            matrix[i][j] += diff;
            sumRow[i] += diff;
            sumCol[j] += diff;
            // Update the count variable
            count += diff;
            // If ith row satisfied, increment ith value for
            // next iteration
            if (sumRow[i] == maxSum)
                ++i;
            // If jth column satisfied, increment jth value
            // for next iteration
            if (sumCol[j] == maxSum)
                ++j;
        }
        return count;// code here
    }
}
