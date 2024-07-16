class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int check=0;
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(temp==ch)
            {
                check++;
                if(check==count)
                {
                    String res=s.substring(i+1);
                    return res;
                }
            }
        }
        return "";
    }
}
