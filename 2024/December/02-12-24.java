class Solution {

ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int i=0;         
        int n = txt.length();

        ArrayList<Integer> list = new ArrayList<>();

       
        while(i<n){
            int ind = txt.indexOf(pat, i);

             // Pattern not found further

             if (ind == -1) {

                break;
            }

            list.add(ind);
            // Move the index to the next character after the current match
            i = ind + 1;
        }
        
        return list;
    }
}
