class Solution{
    static int minValue(String s, int k){
        // code here
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(char ch : map.keySet()){
            al.add(map.get(ch));
        }
        
        // System.out.println(al);
        
        while(k > 0){
            Collections.sort(al);
            
            al.add(al.size() - 1, al.get(al.size() - 1) - 1);
            al.remove(al.size() -1);
            k--;
        }
        
        // System.out.println(al);
        int sum = 0;
        for(int ele : al){
            sum += (ele * ele);
        }
        
        return sum;
    }
}

