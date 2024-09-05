class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        return n*(n+1)/2-Arrays.stream(arr).sum();
    }
}
