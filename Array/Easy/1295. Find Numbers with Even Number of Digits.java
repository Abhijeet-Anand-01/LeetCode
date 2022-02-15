class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums)
            if (even(num))
                count++;
        return count;
    }
    
    static boolean even(int num) {
        int noOfDigits = digits(num);
        return noOfDigits % 2 == 0;
    }
    
    static int digits(int num) {
        int countDigits = 0;
        while (num > 0) {
            countDigits++;
            num /= 10;
        }
        return countDigits;
    }
}
