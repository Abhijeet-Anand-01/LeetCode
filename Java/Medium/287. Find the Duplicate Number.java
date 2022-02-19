class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }
        
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return nums[index];
            }
        }
        return -1;
    }
}
