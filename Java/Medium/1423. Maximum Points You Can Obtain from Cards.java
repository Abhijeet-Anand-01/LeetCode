class Solution {
    public int maxScore(int[] nums, int k) {
        int sum = 0, max = 0;
        int left = k - 1, right = nums.length - 1;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for (int i = 0; i < k; i++) {
            sum = sum - nums[left--] + nums[right--];
            max = Math.max(sum, max);
        }
        return max;
    }
}
