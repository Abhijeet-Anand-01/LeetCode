//Approach 1 : Using 2D Array

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[][] flag = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0)
                    setZeroes(matrix, flag, m, n, i, j);
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag[i][j]) matrix[i][j] = 0;
            }
        }
    }
    private void setZeroes(int[][] matrix, boolean[][] flag, int m, int n, int i, int j) {
        // vertical
        for (int k = 0; k < m; k++) {
            flag[k][j] = true;
        }
         // horizontal
        for (int k = 0; k < n; k++) {
            flag[i][k] = true;
        }
    }
}



//Approach 2 : Optimized using 1D array

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] flag = new boolean[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0)
                    setZeroes(matrix, flag, m, n, i, j);
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag[n * i + j]) matrix[i][j] = 0;
            }
        }
    }
    private void setZeroes(int[][] matrix, boolean[] flag, int m, int n, int i, int j) {
        // vertical
        for (int k = 0; k < m; k++) {
            flag[n * k + j] = true;
        }
        // horizontal
        for (int k = 0; k < n; k++) {
            flag[n * i + k] = true;
        }
    }
}



// Approach 3 : With O(1) space complexity

class Solution {
    public void setZeroes(int[][] matrix) {
        Boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < R; i++) {
            if (matrix[i][0] == 0) {
            isCol = true;
            }
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }
        if (isCol) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
