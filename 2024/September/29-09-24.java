class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int count =0;
        for(int i=0;i<arr.length;i++){
            count++;
            while(arr[i]>k){
                arr[i]-=k;
                count++;
            }
        }
        return count;
    }
}

