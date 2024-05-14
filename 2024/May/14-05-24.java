class Solution {

    // Function to find the minimum effort required to travel from the top-left cell to the bottom-right cell.
    public static int MinimumEffort(int rows, int columns, int[][] heights) {
        // Create a priority queue to store cells with their coordinates and maximum efforts.
        // Use a comparator to prioritize cells based on their maximum efforts.
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a, b) -> a.get(2).compareTo(b.get(2)));

        // Define possible directions: right, left, down, up.
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        // Create a boolean array to mark visited cells.
        boolean[][] visited = new boolean[rows][columns];

        // Initialize all cells as unvisited.
        for (boolean[] row : visited)
            Arrays.fill(row, false);

        // Add the starting cell (top-left) with coordinates (0, 0) and zero effort to the priority queue.
        pq.add(List.of(0, 0, 0));

        // Iterate until the priority queue is empty.
        while (!pq.isEmpty()) {
            // Extract the cell with the minimum effort from the priority queue.
            List<Integer> cell = pq.poll();
            int x = cell.get(0);
            int y = cell.get(1);
            int maxEffort = cell.get(2);

            // If the extracted cell is the destination cell, return its maximum effort.
            if (x == rows - 1 && y == columns - 1)
                return maxEffort;

            // Mark the current cell as visited.
            visited[x][y] = true;

            // Explore all possible directions from the current cell.
            for (int[] dir : directions) {
                int nextX = x + dir[0];
                int nextY = y + dir[1];

                // Check if the next cell is within bounds and unvisited.
                if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < columns && !visited[nextX][nextY]) {
                    // Calculate the maximum effort for the next cell.
                    int nextMaxEffort = Math.max(maxEffort, Math.abs(heights[x][y] - heights[nextX][nextY]));

                    // Add the next cell with its coordinates and maximum effort to the priority queue.
                    pq.add(List.of(nextX, nextY, nextMaxEffort));
                }
            }
        }

        // If there is no path to the destination, return -1.
        return -1;
    }
}
