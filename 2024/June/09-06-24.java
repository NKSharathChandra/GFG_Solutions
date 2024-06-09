class Solution {
    public static void zigZag(int n, int[] arr) 
    {
        // code here
        boolean flag = false;
        
        for(int i=1;i<arr.length;i++)
        {
            if(!flag && arr[i]<arr[i-1])
            {
                swap(arr,i-1,i);
            }
            if(flag && arr[i]>arr[i-1])
            {
                swap(arr,i,i-1);
            }
            flag = !flag;
        }
    }
    static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
