class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        for(char ch : x.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }
            else{
                if(ch == '}') ch = '{';
                if(ch == ')') ch = '(';
                if(ch == ']') ch = '[';
                if(!st.isEmpty() && st.peek() != ch){
                    return false;
                }
                else if(st.isEmpty()){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
