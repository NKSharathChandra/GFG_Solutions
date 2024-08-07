class Solution {
    public long kthElement(int K, int arr1[], int arr2[]) {
        // code here
        int n = arr1.length, m = arr2.length;
        int[] temp = new int[n+m];
        int k = 0;
        for(int i = 0; i < n; i++) temp[k++] = arr1[i];
        for(int i = 0; i < m; i++) temp[k++] = arr2[i];
        Arrays.sort(temp);
        return temp[K-1];
    }
}
