class Solution {

    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int mini,maxi,ans;
        ans=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue;
            mini=Math.min(arr[0]+k,arr[i]-k);
            maxi=Math.max(arr[n-1]-k,arr[i-1]+k);
            ans=Math.min(ans,maxi-mini);
        }
        return ans;
    }
}
