class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int freq=n/k;
        HashMap<Integer, Integer> hm=new HashMap();
        int count=0;
        for(int i=0;i<n;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
            if(hm.get(arr[i])==freq+1) count++;
        }
        
        return count;
        
        
    }
}
