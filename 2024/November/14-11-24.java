class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }
        int pointer=0;
        for(int i=k+1;i<arr.length;i++){
            int firstele=pq.poll();
            arr[pointer++]=firstele;
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            int ele=pq.poll();
            arr[pointer++]=ele;
        }
    }
}
