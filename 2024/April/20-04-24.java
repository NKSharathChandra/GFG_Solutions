class Solution{
  public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            set.add(arr2[j]);
        }
        Integer arr[]=set.toArray(new Integer[0]);
        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            
        }
        
         Collections.sort(list);
         return list;
        
       
       
    }
}
