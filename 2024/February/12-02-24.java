class Solution{
    static long sequence(int n){
        long ct = 1, sum = 0, temp = 1, number = 1;
        while(number <= n)
        {
            for(int i = 0;i < number; i++)
            {
                temp=(ct*temp)%1000000007;
                ct++;
                
            }
            
            sum=(sum+temp)%1000000007;
          
           temp=1;
            
            
            number++;
        }
        return sum%1000000007;
    }
}
