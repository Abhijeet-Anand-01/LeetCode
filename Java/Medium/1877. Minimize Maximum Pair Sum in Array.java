class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1, max = -1;
        while (start < end) {
            int val = nums[start] + nums[end];
            if (val > max) max = val;
            start++;
            end--;
        }
        return max;
    }
}
