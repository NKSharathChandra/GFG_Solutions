class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        for (int i = 0; i < n - 1; i++) {     //for element lying in first index or any middle positions
            if (arr2[i] != arr1[i]) {
                return i;
            }
        }
        
        return n - 1;      //for element lying at the last
    }
}
