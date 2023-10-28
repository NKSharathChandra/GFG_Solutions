class Solution
{
    public int is_bleak(int n)
    {
       int m=n;
      
       
       for(int i=m-1; i>=m-32; i--){
           
           if(i+countSetBits(i) == m) {
              return 0;
           }
           
       }
       
       return 1;
    }
    
    int countSetBits(int n){
        int setBits = 0;
        
        while(n>0){
            if((n&1) == 1) setBits++;
            n=n/2;
        }
        return setBits;
    }
}

