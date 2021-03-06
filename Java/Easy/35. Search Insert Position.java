class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        while (++index < nums.length) {
            if (target <= nums[index]) {
                return index;
            }
        }
        return index;
    }
}
