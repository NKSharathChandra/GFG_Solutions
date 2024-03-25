class Solution {
 ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> sol = new ArrayList<>();
        StringBuilder builder = new StringBuilder(N);
        builder.append('1');
        solve(N-1, 0, 0, builder, sol);
        return sol;
    }
    
    private void solve(int n, int ones, int zeros, 
                    StringBuilder builder, List<String> list){
        if(n == 0){
            list.add(builder.toString());
            return;
        }
        
        builder.append('1');
        solve(n-1, ones+1, zeros, builder, list);
        builder.deleteCharAt(builder.length()-1);
        
        if(ones >= zeros){
            builder.append('0');
            solve(n-1, ones, zeros+1, builder, list);
            builder.deleteCharAt(builder.length()-1);
        }
    }
}
