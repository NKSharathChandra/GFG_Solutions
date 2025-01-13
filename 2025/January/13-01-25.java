class Solution {

    public int maxWater(int arr[]) {
        int left = 0; // Pointer at the start of the array
        int right = arr.length - 1; // Pointer at the end of the array
        int maxArea = 0; // Variable to store the maximum area

        while (left < right) {
            // Calculate the width and height of the container
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);

            // Update the maximum area
            maxArea = Math.max(maxArea, width * height);

            // Move the pointer pointing to the shorter line
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
