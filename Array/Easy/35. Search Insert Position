class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        while (++index < nums.length) {
            if (target == nums[index])
                break;
            if (target < nums[index])
                break;
        }
        return index;
    }
}
