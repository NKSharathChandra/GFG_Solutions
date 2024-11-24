class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        int maxi = Integer.MIN_VALUE; // Similar to -1e9
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
 
    }
