class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
       ArrayList<Integer> tail = new ArrayList<>();
        int len = 0;

        for (int i = 0; i < n; i++) {
            int idx = binarySearch(tail, 0, len - 1, arr[i]);
            if (idx == len) {
                tail.add(arr[i]);
                len++;
            } else {
                tail.set(idx, arr[i]);
            }
        }

        return len;
    }

    static int binarySearch(ArrayList<Integer> tail, int l, int r, int x) {
        while (r >= l) {
            int m = l + (r - l) / 2;
            if (tail.get(m) == x) {
                return m;
            } else if (tail.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }
} 
