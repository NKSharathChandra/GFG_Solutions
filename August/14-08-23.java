class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        HashSet<Integer> uniqueNums = new HashSet<>();
        
        for (int num : nums) {
            if (!uniqueNums.add(num)) {
                uniqueNums.remove(num);
            }
        }
        
        int j = 0;
        for (int num : uniqueNums) {
            arr[j] = num;
            j++;
        }
        
        return arr;
    }
}
