class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int i = 0, j = length - 1;
        for (int pos = length - 1; pos >= 0; pos--) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[pos] = nums[i] * nums[i];
                i++;
            } else {
                result[pos] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
