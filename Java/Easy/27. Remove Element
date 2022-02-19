class Solution {
    public int removeElement(int[] nums, int val) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[curIndex] = nums[i];
                ++curIndex;
            }
        }
        return curIndex;
    }
}
