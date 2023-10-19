class Solution
{    
    int nodeLevel(int v, ArrayList<ArrayList<Integer>> adj, int x)
    {
       boolean visit[] = new boolean[v];
       Queue<Integer> q = new LinkedList<>();
       HashMap<Integer,Integer> map = new HashMap<>();
       
       q.add(0);
       visit[0] = true;
       map.put(0,0);
       while(!q.isEmpty()){
           int s = q.poll();
           ArrayList<Integer> val = adj.get(s);
           for(int i=0;i<val.size();i++){
               if(!visit[val.get(i)]){
                   q.add(val.get(i));
                   visit[val.get(i)] = true;
                   map.put(val.get(i),map.get(s)+1);
               }
           }
       }
       if(map.containsKey(x)){
           return map.get(x);
       }else{
           return -1;
       }
    }
}
