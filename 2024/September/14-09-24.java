class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        for(int ele : arr){
            if(ele >= 0){
                positive.add(ele);
            }
            else{
                negative.add(ele);
            }
        }
        
        int posIndex = 0;
        int negIndex = 0;
        ArrayList<Integer> result = new ArrayList<>();
        
        while(posIndex<positive.size() && negIndex<negative.size()){
            result.add(positive.get(posIndex++));
            result.add(negative.get(negIndex++));
        }
        
        while(posIndex<positive.size()){
            result.add(positive.get(posIndex++));
        }
        
        while(negIndex<negative.size()){
            result.add(negative.get(negIndex++));
        }
        
        arr.clear();
        arr.addAll(result);
    }
}
