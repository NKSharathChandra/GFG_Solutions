class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        
        // first trying to reverse it by single digit.
        
        int z = arr.size();
        
        int val = z/2;
        
        
        int i=0;
        
        
        while(val > 0 ){
            int n = arr.size();
            int a = arr.get(n-1);
            
            // rotating the list
            // deleting the last element from list and adding it in front.
            arr.remove(n-1);
            arr.add(0,a);
            
            // now delete the ith number from last in list.
            arr.remove(n-1-i);
            
            // we have to do the above operations till val is greater than 0.
            // so just reducing it after doing one operation.
            val--;
            
            // keep increasing the index i, so that we could delete the correct element 
            // from given list
            i++;
        }
        
        // returning the first element of given list
        return arr.get(0);
    }
}
