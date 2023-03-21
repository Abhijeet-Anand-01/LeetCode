class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;

        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            while (j < nums.length && nums[j] == 0) j++;
            // if (j == nums.length) 
            long n = j - i;
            long sum = (n * (n + 1)) / 2;
            count += sum;

            
            j++;
            i = j;
        }

        return count;
    }
}
