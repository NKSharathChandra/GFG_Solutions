class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int n=arr.size();
        int i=0;
        int c=0;
        while(i<n)
        {
            int k=arr.get(i);
            if(arr.get(k-1)==k)
            {
                i++;
            }
            else
            {
                int temp=arr.get(k-1);
                arr.set((k-1),k);
                arr.set(i,temp);
                c++;
            }
        }
        return c==2 || c==0;
    }
}
