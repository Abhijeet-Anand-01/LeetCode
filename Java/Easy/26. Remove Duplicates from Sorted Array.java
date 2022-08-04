class Solution {
    public int removeDuplicates(int[] nums) {
        int currPointer = 1, k = 1, n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[currPointer++] = nums[i];
                k++;
            }
        }
        return k;
    }
}
