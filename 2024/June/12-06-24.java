class Solution {
    public static int countNumberswith4(int n) {
        int count =0;
        
        for(int i =0; i<=n ;i++){
            int x = i;
            
            while(x>0){
                int d = x%10;
                if(d == 4){
                    count++;
                    break;
                }
                else{
                    x =x/10;
                }
            }            
        }
        return count;
    }
}
