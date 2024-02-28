class Solution{
    int DivisibleByEight(String s){
        return (s.length()<=3)?(Integer.valueOf(s)%8==0)?1
                :-1:(Integer.valueOf(s.substring(s.length()-3,s.length()))%8==0)?1:-1;
    }
}
