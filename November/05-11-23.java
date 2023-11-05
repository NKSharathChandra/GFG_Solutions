class Pair{
    
    int key;
    int value;
    Pair(int key,int value){
        this.key = key;
        this.value = value;
    }
}

 class customSort implements Comparator<Pair>{
 
    public int compare(Pair p1,Pair p2){
        
        if(p1.value==p2.value){

            return p2.key-p1.key;
        } 
        
        
      return p2.value-p1.value;
    }
    
}


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        List<Pair> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           
           list.add(new Pair(entry.getKey(),entry.getValue()));

        }
        
        Collections.sort(list,new customSort());
        int arr[] = new int[k];
        
        
        for(int i = 0;i<k;i++){
            arr[i] = list.get(i).key;
        }
        return arr;
        
    }
}
