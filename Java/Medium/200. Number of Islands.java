class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    removeIsland(grid, m, n, i, j);
                }
            }
            
        }
        return count;
    }
    private void removeIsland(char[][] grid, int m, int n, int i, int j) {
        if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == '1') {
            grid[i][j] = '0';
            removeIsland(grid, m, n, i, j + 1);
            removeIsland(grid, m, n, i + 1, j);
            removeIsland(grid, m, n, i, j - 1);
            removeIsland(grid, m, n, i - 1, j);
        }
      
    }
}
