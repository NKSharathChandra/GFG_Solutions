class Solution {
    // Function to partition the array around the range such 
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] < a)
                swap(arr, mid++, low++);
            else if (arr[mid] >= a && arr[mid] <= b)
                mid++;
            else
                swap(arr, mid, high--);
        }
    }
    // Helper function to swap two elements in the array
    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
