class Solution {
    int countPairsWithDiffK(int[] arr, int k) 
    {
        // code here
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < arr.length; i++) {
            res += map.getOrDefault(arr[i] + k, 0);
            res += map.getOrDefault(arr[i] - k, 0);
            
            map.put(arr[i], map.getOrDefault(arr[i] , 0) + 1);
        }
        return res;
    }
}
