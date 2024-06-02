class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int xorValue = 0;
        for(int i=0; i<q; i++){
            if(queries[i][0] == 0){
                ans.add(queries[i][1] ^ xorValue);
            }else{
                xorValue ^= queries[i][1];
            }
        }
        
        for(int j=0; j<ans.size(); j++){
            ans.set(j, ans.get(j)^xorValue);
        }
        Collections.sort(ans);
        return ans;  
    }
