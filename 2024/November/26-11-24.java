class Solution {

    public int circularSubarraySum(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int curr=0,currneg=0;
        int s=0;
        for(int i:arr)
        {
            s+=i;
            curr+=i;
            maxSum= Math.max(curr,maxSum);
            if(curr<0)
            {
                curr=0;
            }
            currneg+=i;
            minSum=Math.min(currneg,minSum);
            if(currneg>0)
            {
                currneg=0;
            }
        }
        if(s==minSum)
        {
            return maxSum;
        }
        return Math.max(maxSum,s-minSum);
        
    }
}
