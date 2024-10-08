class Solution {
    public static int pairsum(int[] arr) 
    {
        // code here
        //int sum = 0;
        int n = arr.length;
        Arrays.sort(arr); // 6 10 12 34 40
       
        return arr[n-1] + arr[n - 2];
    }
}
