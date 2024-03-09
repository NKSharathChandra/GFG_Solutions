class Solution{
 public char nthCharacter(String s, int r, int n)
    {
        //code here
        for(int i=0;i<r;i++){
            s=solve(s,n);
        }
        return s.charAt(n);
        
    }
    String solve(String str,int r){
        for(int i=0;i<str.length() && i<=r+1;i+=2){
            if(str.charAt(i)=='0'){
                str=str.substring(0,i)+"01"+str.substring(i+1);
            }else{
                str=str.substring(0,i)+"10"+str.substring(i+1);
            }
        }
        return str;
    }
}
