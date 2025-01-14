class Solution {
    public static int findEquilibrium(int arr[]) {
       //logic is we have to condtion when leftsum==rightsum
       int totalsum=0;
       int leftsum=0;
       int n=arr.length;
       for(int i=0;i<n;i++){
           totalsum+=arr[i];
       }
       for(int i=0;i<n;i++){
           //totalsum=leftsum+rightsum
           //rightsum=totalsum-leftsum
           totalsum-=arr[i];//leftsum decreasing from totalsum
           if(leftsum==totalsum){
               return i;
           }
           leftsum+=arr[i]; //updating leftsum index wise
       }
      return -1;
    }
}
