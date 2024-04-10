class Solution{
    static int findSingle(int n, int arr[]){
        int ans=0;
       for(int x : arr){
           ans = ans^x;
       }
       return ans;
    }
}
