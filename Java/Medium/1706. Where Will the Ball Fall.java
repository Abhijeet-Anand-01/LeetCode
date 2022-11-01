class Solution {
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            findBall(grid, 0, i, i, res);
        }
        return res;
    }
    private void findBall(int[][] grid, int r, int c, int idx, int[] res) {
        if (r == grid.length) {
            res[idx] = c;
            return;
        }

        if ((grid[r][c] == -1 && (c == 0 || grid[r][c - 1] == 1)) || (grid[r][c] == 1 && (c == grid[0].length - 1 || grid[r][c + 1] == -1))) {
            res[idx] = -1;
            return;
        }

        if (grid[r][c] == 1) {
            findBall(grid, r + 1, c + 1, idx, res);
        }
        else {
            findBall(grid, r + 1, c - 1, idx, res);
        }

    }
}
// [ 1, 1, 1,-1,-1],
// [ 1, 1, 1,-1,-1],
// [-1,-1,-1, 1, 1],
// [ 1, 1, 1, 1,-1]
// [-1,-1,-1,-1,-1]


