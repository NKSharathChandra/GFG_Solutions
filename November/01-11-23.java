class Solution{
    
    public static void frequencyCount(int arr[], int N, int P)
    {   int[] ans = new int[P+1];
        for(int i=0; i<N; i++){
            ans[arr[i]]++;
        }
        for(int i=0; i<N; i++){
            if(i<P){
                arr[i] = ans[i+1];
            }
            else{
                arr[i]=0;
            }
        }
    }
}
