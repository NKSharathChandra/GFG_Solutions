class Solution{
public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> lst= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[left]+arr[right]+arr[i];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    List<Integer> ans= new ArrayList<>();
                    ans.add(arr[i]);
                    ans.add(arr[left]);
                    ans.add(arr[right]);
                    lst.add(ans);
                }
                while(left<right && arr[left]==arr[left+1]) left++;
                while(left<right && arr[right]==arr[right-1])  right--;
                left++;
                right--;
            }
        }
        return lst;
    }
}
