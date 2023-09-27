class Solution{
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0,j = m - 1, first = arr[i], second = brr[j], p = Integer.MAX_VALUE;
    
        while (i < arr.length && j >= 0) {
            int sum = arr[i] + brr[j];
            int diff = Math.abs(x - sum);
    
            if (p > diff) {
                p = diff;
                first = arr[i];
                second = brr[j];
            }
    
            if (sum < x)  i++; 
            else  j--;
        }
        list.add(first);
        list.add(second);
    
        return list;

    }
}
