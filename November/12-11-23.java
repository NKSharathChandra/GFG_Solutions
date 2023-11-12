    public static boolean isRotated(String str1, String str2)
    {
         String way1,way2;
        int size=str1.length();
        way1=str1.charAt(size-2)+""+str1.charAt(size-1);
        String result1=way1+str1.substring(0,size-2);
            if(result1.equals(str2))
               return true;
        way2=str1.charAt(0)+""+str1.charAt(1);
        String result2=str1.substring(2)+way2;
        if(result2.equals(str2))
             return true;
     
      return false;
        
        
    }
