class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePathsHelper(m, n, new int[m + 1][n + 1]);
    }

    private int uniquePathsHelper(int m, int n, int[][] memo) {
        if (m == 1 || n == 1) 
            return 1;
        
        if (memo[m][n] != 0) 
            return memo[m][n];
        
        memo[m][n] = uniquePathsHelper(m - 1, n, memo) + uniquePathsHelper(m, n - 1, memo);
        return memo[m][n];
        
    }
}
