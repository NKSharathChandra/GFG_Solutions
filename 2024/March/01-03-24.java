class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int start = 0,end = n -1;
       while(start < end){
           int mid = start + (end - start)/2;
            if(arr[mid] <= arr[mid+1])
              start = mid + 1;
             else 
               end = mid;
       }
       return start;
       
    }
}
