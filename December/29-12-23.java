class Solution{
  int kSubstrConcat(int n, String s, int k)
    {
        // Your Code Here   
        if(n % k != 0) return 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<=n-k;i+=k){
            String tmp = s.substring(i,i+k);
            map.put(tmp,map.getOrDefault(tmp,0)+1);
            if(map.size() > 2) return 0;
        }
        int cnt = 0;
        for( int it : map.values()){
            if(it > 1) cnt++;
        }
        return cnt >= 2 ? 0 : 1;
    }
}
