class Solution {
    public int maxDistance(int[] arr) {
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxDist = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (firstOccurrence.containsKey(arr[i])) {
                // Calculate the distance between first occurrence and current index
                int dist = i - firstOccurrence.get(arr[i]);
                // Update the maximum distance
                maxDist = Math.max(maxDist, dist);
            } else {
                // Store the first occurrence of the element
                firstOccurrence.put(arr[i], i);
            }
        }

        return maxDist;
    }
}
