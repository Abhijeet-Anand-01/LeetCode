// Approach 1 : Not effective since String matching takes more time

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<String>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}
    


// Approach 2 

class Solution {
    public boolean isValidSudoku(char[][] board) {      
        
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rowCheck[board[i][j] - '1']) return false;
                    else rowCheck[board[i][j] - '1'] = true;
                }
                if (board[j][i] != '.') {
                    if (colCheck[board[j][i] - '1']) return false;
                    else colCheck[board[j][i] - '1'] = true;
                }
                int m = i/3*3 + j/3;
                int n = i%3*3 + j%3;
                if (board[m][n] != '.') {
                    if (boxCheck[board[m][n] - '1']) return false;
                    else boxCheck[board[m][n] - '1'] = true;
                }
            }
        }
        return true;
    }
}
    
