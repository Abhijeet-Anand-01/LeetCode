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
