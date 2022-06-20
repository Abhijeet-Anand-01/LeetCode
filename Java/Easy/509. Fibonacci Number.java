// Approach 1 : Looping

class Solution {
    public int fib(int n) {
        int num1 = 0, num2 = 1, sum = 0;  
        while (n-- > 0) {
            sum = num1 + num2;
			num1 = num2;
			num2 = sum;
        }
        return num1;
    }
}


// Approach 2 : Recursion

class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        
        return fib(n - 1) + fib(n - 2);
    }
}


// Approach 3 : Dynamic Programming

class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        return dp(n, memo);
    }
    
    private int dp(int n, int[] memo) {
        if (n == 0 || n == 1)
            return n;
        
        if (memo[n] != 0)
            return memo[n];
        
        memo[n] = dp(n - 1, memo) + dp(n - 2, memo);
        return memo[n];
    }
}
