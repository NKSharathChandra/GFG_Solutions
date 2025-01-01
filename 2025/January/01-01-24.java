class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        
        
        Map<String , ArrayList<String> > map = new LinkedHashMap<>();
        
        
        for(String str : arr){
            
            char[] ch = str.toCharArray();
            
            Arrays.sort(ch);
            
            String key = new String(ch);
            
            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(str);
            
           }
        for (ArrayList<String> group : map.values()) {
            ans.add(group); 
        }
            return ans;
    }
}
