class Solution {
    int minDist(int a[], int n, int x, int y) {
        int index1=-1,index2=-1,ans=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(a[i]==x) index1=i;
            if(a[i]==y) index2=i;
            
            if(index1!=-1 && index2!=-1) ans=Math.min(ans,Math.abs(index1-index2));
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
