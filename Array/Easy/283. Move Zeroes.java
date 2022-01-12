class Solution {
    public void moveZeroes(int[] nums) {
        int currIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[currIndex++] = nums[i];
        }
        
        while (currIndex < nums.length)
            nums[currIndex++] = 0;
    }
}
