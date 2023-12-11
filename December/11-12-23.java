class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long sum=0,max=0;
        int prev=0;
        for(int i=0;i<N;i++){
            if(i-prev+1<=K) sum+=Arr.get(i);
            else{
                if(sum>max) max=sum;
                sum-=Arr.get(prev);
                prev++;
                i--;
            }
        }
        if(sum>max) max=sum;
        return max;
    }
}
