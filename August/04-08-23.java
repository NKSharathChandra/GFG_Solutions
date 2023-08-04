class Solution
{  
    static void insert_at_bottom(Stack<Integer> s,int x){
        if(s.size()==0) 
            s.push(x);        
        else{
            int a=s.peek();
            s.pop();
            insert_at_bottom(s,x);
            s.push(a);
        }
        
}
    static void reverse(Stack<Integer> s)
    {
        if(s.size()>0){
            int x=s.peek();
            s.pop();
            reverse(s);
            insert_at_bottom(s,x);
        }
    }
}
