class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> list=new ArrayList<>();
        
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=-1*(arr[i]+arr[j]);
                if(map.containsKey(sum)){
                    for(int num : map.get(sum)){
                        if(num>j && num>i && j>i){
                            List<Integer> ans=new ArrayList<>(Arrays.asList(i,j,num));
                            list.add(ans);
                        }
                    }
                    
                }
                
            }
        }
        return list;
    }
