class Solution {

    public boolean isValid(String str) {
        
        String[] arr = str.split("[.]");
        
        if(arr.length < 4 || arr.length > 4)
            return false;
            
        for(int i = 0; i < arr.length; i++) {
            
            arr[i] = arr[i].replaceAll(" ", "");  // replace all spaces with empty
            
            if(arr[i].equals(""))  // if one of the 4 string is empty then there is invalid IP
                return false;
                
            if(arr[i].length() != 1 && arr[i].charAt(0) == '0')  // Check for leading zeroes
                return false;
                
            int temp = Integer.parseInt(arr[i]);  // convert string to integer and validate if it in the range of 0 to 255
            if(temp < 0 || temp > 255)
                return false;
        }
        
        return true;
    }
}
