class Solution {
    public int reverse(int n) {
        return helper(n, 0);
	}

    int helper(int num1, int num2){
        if (num1 == 0) {
            return num2;
        }
        if ((Integer.MAX_VALUE / 10) < num2 || (Integer.MIN_VALUE / 10) > num2) {
            return 0;
        }
        return helper(num1 / 10, num2 * 10 + num1 % 10);
    }
}
