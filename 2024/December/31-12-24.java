class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr); // Sort the array
        int ans = 0;
        int count = 1; // Start with a count of 1 to include the first element
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                // Skip duplicates
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                // Increment count for consecutive elements
                count++;
            } else {
                // Update ans and reset count for a new sequence
                ans = Math.max(ans, count);
                count = 1;
            }
        }

        // Final update for the last sequence
        ans = Math.max(ans, count);

        return ans;
    }
}
