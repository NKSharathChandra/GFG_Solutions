class Solution{
  public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length / 3;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > n) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}
