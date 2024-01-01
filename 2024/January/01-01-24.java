class Solution {
    public boolean canPair(int[] nums, int k) {
        if (nums.length % 2 == 1)
            return false;

        // Create a HashMap to store the frequency of remainders
        Map<Integer, Integer> remainderFrequency = new HashMap<>();

        // Count the frequency of each remainder
        for (int num : nums) {
            int remainder = (num % k + k) % k; // Handle negative numbers
            remainderFrequency.put(remainder, remainderFrequency.getOrDefault(remainder, 0) + 1);
        }

        for (int num : nums) {
            int remainder = (num % k + k) % k; 

            // If the remainder is 0, check if the frequency is even
            if (remainder == 0) {
                if (remainderFrequency.getOrDefault(0, 0) % 2 == 1)
                    return false;
            }
            // For non-zero remainders, check if there is a corresponding pair
            else if (remainderFrequency.getOrDefault(remainder, 0) != remainderFrequency.getOrDefault(k - remainder, 0))
                return false;
        }

        return true;
    }
}
