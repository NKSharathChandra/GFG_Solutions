class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
//the number itself is the closest one! so using binary search

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return arr[mid];
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
//if greater than arr length then there must be only one value, so return it

        if (left >= arr.length) {
            return arr[arr.length - 1];
        }
 //if less than arr length then there must be only one value, so return it
         else if (right < 0) {
            return arr[0];
        } else {

//return the left if left value distance is less and for more, return right value
            if (Math.abs(arr[left] - k) <= Math.abs(arr[right] - k)) {
                return arr[left];
            } else {
                return arr[right];
            }
        }
    }
}
