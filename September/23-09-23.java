class Solution {
    public static int equilibriumPoint(long arr[], int n) {
  long sum = 0,presum = 0;
   for(int i = 0; i<n; i++){
       sum+=arr[i];
   }
   for(int j = 0; j<n; j++){
       sum-=arr[j];
       if(sum == presum) return j+1;
       presum+=arr[j];
   }
   return -1;
 }
}
