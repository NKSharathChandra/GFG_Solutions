class Solution {
public static double findSmallestMaxDist(int stations[], int k) {
        PriorityQueue<Double> pq = new PriorityQueue<Double>(Collections.reverseOrder());
        //put every distance (d in pq)
        for(int i =1;i<stations.length;i++){
            pq.add((Double.valueOf(stations[i]))-(Double.valueOf(stations[i-1])));
        }
        while(k>0){
            Double diff = pq.remove();
            //max difference , add a new pump
            pq.add(diff/2);
            pq.add(diff/2);
            //add the new differences in the pq
            k--;
        }
        return Math.floor(pq.remove() * 100) / 100;
    }
}
