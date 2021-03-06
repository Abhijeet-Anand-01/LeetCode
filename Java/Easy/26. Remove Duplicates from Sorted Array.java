class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, k = nums.length;
        
        int check = nums[0];
        for (int i = 1; i < k; i++) {
            if(check != nums[i]) {
                index++;
                nums[index] = nums[i];
                check = nums[i];
            }
        }
        return index + 1;
    }
}
