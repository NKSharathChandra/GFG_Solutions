class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder ans=new StringBuilder();
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[arr.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)) break;
            ans.append(first.charAt(i));
        } 
        if(ans.length()==0)return "-1";
        return ans.toString();
    }
}
