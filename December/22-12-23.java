class Solution {
    public static class Pair{
        int start;
        int end;
        int num;
        Pair(int start, int end, int num){
            this.start = start;
            this.end = end;
            this.num = num;
        }
    }
    public static class sortFunction implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            if(a.end>b.end) return 1;
            else if(a.end<b.end) return -1;
            else return 0;
        }
    }
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Pair> meetings = new ArrayList<>();
        for(int i=0; i<N; i++){
            Pair p = new Pair(S[i], F[i], i+1);
            meetings.add(p);
        }
        meetings.sort(new sortFunction());
        ArrayList<Integer> list = new ArrayList<>();
        int endTime = -1;
        for(int i=0; i<N; i++){
            Pair time = meetings.get(i);
            int startTime = time.start;
            if(endTime<startTime){
                list.add(time.num);
                endTime = time.end;
            }
        }
        Collections.sort(list);
        return list;
    }
}
