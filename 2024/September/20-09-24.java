class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int count=1;
        int j=0;
        for(int i=0;i<height.length;i++){
            if(height[i]>height[j]){
                count++;
                j=i;
            }
        }
        return count;
    }
}
