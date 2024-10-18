class Solution {
int getSingle(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) % 2 != 0){
                return i;
            }
        }
        return -1;
    }
}
