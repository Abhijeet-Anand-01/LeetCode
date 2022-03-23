class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) 
            return mat;
        
        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int[] rowElem : mat) {
            for (int elem : rowElem) {
                result[row][col] = elem;
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;
    }
}
