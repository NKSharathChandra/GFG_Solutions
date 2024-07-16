class Solution {
    public String smallestNumber(int s, int d) {
        // code here
        StringBuilder res = new StringBuilder();
        int i = 1;
        while(i<=d){
            int num = s-(d-i)*9<=0?0:s-(d-i)*9;
            if(num>9){
                return "-1";
            }
            if(i==1 && num == 0){
                num = 1;
            }
            res.append((char)(num+'0'));
            s-=num;
            i++;
        }
        return res.toString();
    }
}
