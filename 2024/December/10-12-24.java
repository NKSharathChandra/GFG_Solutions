class Solution {
    static int minRemoval(int inter[][]) {
        Arrays.sort(inter,(a,b)->b[0]-a[0] );
        int count=0;
        int []arr=inter[0];
        for(int i=1;i<inter.length;i++)
        {
           if(arr[0]>=inter[i][1])
           {
               arr=inter[i];
           }
           else
           {
                count++;   
           }
        }
        return count;
    }
}