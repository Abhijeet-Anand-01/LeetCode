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
